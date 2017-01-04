package com.mobiletrain.newapp.adapter;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.mobiletrain.newapp.Config;
import com.mobiletrain.newapp.R;
import com.mobiletrain.newapp.model.QueryBean;
import com.mobiletrain.newapp.util.HttpUtil;
import com.mobiletrain.newapp.util.ThreadUtil;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by idea on 2016/10/10.
 */
public class SearchResultAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<QueryBean.ShowapiResBodyBean.PagebeanBean.ContentlistBean> contentlist = null;
    private Context context;
    private QueryBean data;
    private Handler handler = new Handler();;

    public SearchResultAdapter(Context context, QueryBean data) {
        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);

        if (data != null) {
            contentlist = data.getShowapi_res_body().getPagebean().getContentlist();
        }
    }

    public void setData(QueryBean data,boolean append) {
        this.data = data;
        if (data != null) {
            if(append){
                contentlist.addAll(data.getShowapi_res_body().getPagebean().getContentlist());
            }else {
                contentlist = data.getShowapi_res_body().getPagebean().getContentlist();
            }
            notifyDataSetChanged();
        }
    }

//    public void setData(QueryBean data) {
//        this.data = data;
//        if (data != null) {
//            contentlist = data.getShowapi_res_body().getPagebean().getContentlist();
//            notifyDataSetChanged();
//        }
//    }

    @Override
    public int getCount() {
        if (contentlist != null) {
            return contentlist.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_searh_result, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = ((ViewHolder) convertView.getTag());
        }

        final QueryBean.ShowapiResBodyBean.PagebeanBean.ContentlistBean song = contentlist.get(position);
        final String songname = song.getSongname();
        String singername = song.getSingername();
        String albumname = song.getAlbumname();

        holder.tvName.setText(songname);
        holder.tvInfo.setText(singername + "·" + albumname);

        holder.tvPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, songname + "开始下载...", Toast.LENGTH_SHORT).show();
                ThreadUtil.execute(new Runnable() {
                    @Override
                    public void run() {
                        HttpUtil.downloadMusic(context, song, Config.DOWNLOAD_DIR_PATH, handler);
                    }
                });
            }
        });

        return convertView;
    }

    static class ViewHolder {
        @Bind(R.id.tvMore)
        TextView tvMore;
        @Bind(R.id.tvPlus)
        TextView tvPlus;
        @Bind(R.id.tvName)
        TextView tvName;
        @Bind(R.id.tvDownloaded)
        TextView tvDownloaded;
        @Bind(R.id.tvInfo)
        TextView tvInfo;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }

    }
}
