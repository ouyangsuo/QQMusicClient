package com.mobiletrain.newapp.adapter;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mobiletrain.newapp.R;
import com.mobiletrain.newapp.model.LocalMusic;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by idea on 2016/10/10.
 */
public class LocalMusicAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private Context context;
    private List<LocalMusic> data;
    private Handler handler = new Handler();

    public LocalMusicAdapter(Context context, List<LocalMusic> data) {
        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);
    }

    public void setData(List<LocalMusic> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data == null ? 0 : data.size();
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

        LocalMusic localMusic = data.get(position);
        final String songname = localMusic.getTitle();
        String singername = localMusic.getArtist();
        String albumname = localMusic.getAlbum();

        holder.tvName.setText(songname);
        holder.tvInfo.setText(singername + "·" + albumname);

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
