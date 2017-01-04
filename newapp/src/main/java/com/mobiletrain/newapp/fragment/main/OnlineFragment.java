package com.mobiletrain.newapp.fragment.main;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.mobiletrain.newapp.R;
import com.mobiletrain.newapp.adapter.TopListAdapter;
import com.mobiletrain.newapp.model.TopBean;
import com.mobiletrain.newapp.myinterface.Song;
import com.mobiletrain.newapp.myinterface.SongPlayerFragment;
import com.mobiletrain.newapp.util.HttpUtil;
import com.mobiletrain.newapp.util.JsonUtil;
import com.mobiletrain.newapp.util.ThreadUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

/**
 * Created by idea on 2016/10/9.
 */
public class OnlineFragment extends SongPlayerFragment {
    private static final String TAG = "test";
    @Bind(R.id.lvTops)
    ListView lvTops;

    final List<HashMap<String,Object>> data = new ArrayList<>();
    private TopListAdapter topsAdapter;
    private View view;
    String[] array = {
            "23-销量",
            "26-热歌",
            "18-民谣",
            "19-摇滚",
            "5-内地",
            "6-港台",
            "3-欧美",
            "16-韩国",
            "17-日本",
    };

    private final int MSG_JSON_GOT = 20;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case MSG_JSON_GOT:
                    //取出bundle中的数据
                    Bundle bundle = msg.getData();
                    int order = bundle.getInt("order");
                    String name = bundle.getString("name");
                    String json = bundle.getString("json");

                    //将json解析为topBean
                    TopBean topBean = JsonUtil.parseTopBean(json);
                    if(topBean!=null){
                        //刷新数据
                        HashMap<String, Object> map = data.get(order);
                        map.put("data",topBean);

                        //通知Adapter刷新界面
                        topsAdapter.notifyDataSetChanged();
                    }else {
                        Toast.makeText(getActivity(), "数据异常，请检查网络", Toast.LENGTH_SHORT).show();
                    }

                    break;
            }
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_online, container, false);
            ButterKnife.bind(this, view);

            initData();
            topsAdapter = new TopListAdapter(getActivity(),data);
            lvTops.setAdapter(topsAdapter);

//            View view = LayoutInflater.from(getActivity()).inflate(R.layout.item_tops, lvTops, false);
//            int itemHeight = view.getLayoutParams().height;
//            lvTops.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,itemHeight * array.length));
        }
        return view;
    }

    private void initData() {
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            String[] temp = str.split("-");
            final String topId = temp[0];
            final String name = temp[1] + "榜";
            HashMap<String, Object> map = new HashMap<>();
            map.put("name",name);
            map.put("order",i);
            map.put("data",null);
            data.add(map);


            final int order = i;
            ThreadUtil.execute(new Runnable() {
                @Override
                public void run() {
                    //拿到内地榜的JSON数据
                    final String json = HttpUtil.getTops(topId);
                    Log.e(TAG, "json="+json);

                    //通知主线程【刷新数据】和【刷新界面】
                    Message msg = handler.obtainMessage();
                    msg.what = MSG_JSON_GOT;
                    Bundle bundle = new Bundle();
                    bundle.putInt("order", order);
                    bundle.putString("json",json);
                    msg.setData(bundle);
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

    interface DataFeeder {
        List<HashMap<String,Object>> feedData();
    }

    @OnItemClick(R.id.lvTops)
    public void onLvTopsItemClick(AdapterView<?> parent, View view, int position, long id) {
        HashMap<String, Object> map = data.get(position);
        TopBean bean = (TopBean) map.get("data");
        List<TopBean.ShowapiResBodyBean.PagebeanBean.SonglistBean> songlist = bean.getShowapi_res_body().getPagebean().getSonglist();
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < songlist.size(); i++) {
            songs.add(songlist.get(i));
        }

//        MediaUtil.play(getContext(),songs,0);
        if(songPlayer!=null){
            songPlayer.play(songs,0);
        }
    }


}
