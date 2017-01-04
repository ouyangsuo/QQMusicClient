package com.mobiletrain.newapp.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.mobiletrain.newapp.R;
import com.mobiletrain.newapp.adapter.SearchResultAdapter;
import com.mobiletrain.newapp.model.QueryBean;
import com.mobiletrain.newapp.myinterface.Song;
import com.mobiletrain.newapp.myinterface.SongPlayerFragment;
import com.mobiletrain.newapp.util.HttpUtil;
import com.mobiletrain.newapp.util.JsonUtil;
import com.mobiletrain.newapp.util.ThreadUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;

/**
 * Created by idea on 2016/10/9.
 */
public class SearchFragment extends SongPlayerFragment {

    public static final int MSG_QUERY_RESULT_JSON_GOT = 30;
    private static final String TAG = "test";
    @Bind(R.id.tvBack)
    TextView tvBack;
    @Bind(R.id.etSearch)
    EditText etSearch;
    @Bind(R.id.tvSearch)
    TextView tvSearch;
    @Bind(R.id.lvRecent)
    ListView lvRecent;
    @Bind(R.id.lvResult)
    ListView lvResult;
    private View view;
    private SearchResultAdapter searchResultAdapter;
    private View footerView;
    private QueryBean queryBean = null;

    private Handler handler = new Handler() {


        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case MSG_QUERY_RESULT_JSON_GOT:
                    String json = (String) msg.obj;
                    queryBean = JsonUtil.parseQueryBean(json);
                    Log.e(TAG, "queryBean=" + queryBean);
                    if (queryBean != null) {
                        searchResultAdapter.setData(queryBean, msg.arg1 > 0 ? true : false);
                        Toast.makeText(getActivity(), "加载完毕", Toast.LENGTH_SHORT).show();

                        if(msg.arg1 > 0 && footerView!=null){
                            lvResult.removeFooterView(footerView);
                        }
                    } else {
                        Toast.makeText(getActivity(), "数据异常，请检查网络", Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
        }
    };

    private int currentPage = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_search, container, false);
            ButterKnife.bind(this, view);

            searchResultAdapter = new SearchResultAdapter(getActivity(), queryBean);
            lvResult.setAdapter(searchResultAdapter);

            //最后一个ITEM可见且滚动停止，开始查询下一页数据
            footerView = LayoutInflater.from(getContext()).inflate(R.layout.footer_search_result, lvResult, false);
            lvResult.setOnScrollListener(new AbsListView.OnScrollListener() {
                private int lastVisibleItem;

                @Override
                public void onScrollStateChanged(AbsListView view, int scrollState) {

                    if (scrollState == SCROLL_STATE_IDLE) {
                        if (queryBean != null && queryBean.getShowapi_res_body().getPagebean() != null && searchResultAdapter.getCount()-1 == lastVisibleItem) {
                            //显示footerView
                            lvResult.addFooterView(footerView);
                            doSearch(++currentPage,true);
                        }
                    }
                }

                @Override
                public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                    lastVisibleItem = firstVisibleItem + visibleItemCount - 1;
                }
            });
        }
        return view;
    }

    @OnItemClick(R.id.lvResult)
    public void onLvResultItemClick(AdapterView<?> parent, View view, int position, long id) {
        try {
            List<QueryBean.ShowapiResBodyBean.PagebeanBean.ContentlistBean> contentlist = queryBean.getShowapi_res_body().getPagebean().getContentlist();
            List<Song> songs = new ArrayList<>();
            for (int i = 0; i < contentlist.size(); i++) {
                songs.add(contentlist.get(i));
            }

//            MediaUtil.play(getContext(),songs,position);
            if (songPlayer != null) {
                songPlayer.play(songs, position);
            }

        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getActivity(), "播放失败，请检查数据！", Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick(R.id.tvSearch)
    public void onTvSearchClick(View v) {
        Log.e(TAG, "onTvSearchClick: ");
        doSearch(1, false);
    }

    private void doSearch(final int page, final boolean append) {
        final String keyword = etSearch.getText().toString();
        if (keyword != null && !keyword.trim().equals("")) {
            ThreadUtil.execute(new Runnable() {
                @Override
                public void run() {
                    String json;
                    if(append){
                        json = HttpUtil.query(keyword,page);
                    }else {
                        json = HttpUtil.query(keyword,1);
                    }
                    Log.e(TAG, "json=" + json);

                    Message msg = handler.obtainMessage();
                    msg.what = MSG_QUERY_RESULT_JSON_GOT;
                    msg.obj = json;
                    if (append) {
                        msg.arg1 = 1;
                    } else {
                        msg.arg1 = -1;
                    }
                    handler.sendMessage(msg);
                }
            });
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick(R.id.tvBack)
    public void onTvBackClick() {
        if (listener != null) {
            listener.onSearchFragmentTvBackClick();
        }
    }

    OnSearchFragmentViewClickListener listener;

    public void setListener(OnSearchFragmentViewClickListener listener) {
        this.listener = listener;
    }

    public interface OnSearchFragmentViewClickListener {
        void onSearchFragmentTvBackClick();
    }

}
