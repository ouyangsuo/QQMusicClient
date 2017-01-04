package com.mobiletrain.newapp.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.mobiletrain.newapp.R;
import com.mobiletrain.newapp.model.TopBean;

import java.util.HashMap;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by idea on 2016/10/10.
 */
public class TopListAdapter extends BaseAdapter {

    private static final String TAG = "test";
    private final LayoutInflater inflater;
    Context context;
    List<HashMap<String, Object>> data;//name:'欧美帮','data':topBean

    public TopListAdapter(Context context, List<HashMap<String, Object>> data) {
        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.size();
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
//        Log.e(TAG, "getView() called with: " + "position = [" + position + "], convertView = [" + convertView + "], parent = [" + parent + "]");
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_tops, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        HashMap<String, Object> map = data.get(position);

        //显示榜单名称
        String topName = (String) map.get("name");
        holder.tvName.setText(topName);

        TopBean topBean = (TopBean) map.get("data");

        //没有拿到正确数据则直接返回默认界面
        if (topBean == null || topBean.getShowapi_res_body().getPagebean() == null) {
            return convertView;
        }

        //拿到前三名的信息
        List<TopBean.ShowapiResBodyBean.PagebeanBean.SonglistBean> songlist = topBean.getShowapi_res_body().getPagebean().getSonglist();
        TopBean.ShowapiResBodyBean.PagebeanBean.SonglistBean firstSong = songlist.get(0);
        TopBean.ShowapiResBodyBean.PagebeanBean.SonglistBean secondSong = songlist.get(1);
        TopBean.ShowapiResBodyBean.PagebeanBean.SonglistBean thirdSong = songlist.get(2);

        //显示本榜单前三名的信息
        TextView tvFirstInfo = (TextView) holder.singleI.findViewById(R.id.tvSingleInfo);
        TextView tvSecondInfo = (TextView) holder.singleII.findViewById(R.id.tvSingleInfo);
        TextView tvThirdInfo = (TextView) holder.singleIII.findViewById(R.id.tvSingleInfo);
        tvFirstInfo.setText("1 " + firstSong.getSongname() + "-" + firstSong.getSingername());
        tvSecondInfo.setText("2 " + secondSong.getSongname() + "-" + secondSong.getSingername());
        tvThirdInfo.setText("3 " + thirdSong.getSongname() + "-" + thirdSong.getSingername());

        //显示第二名身后的箭头即可
        TextView tvFirstArrow = (TextView) holder.singleI.findViewById(R.id.arrow);
        TextView tvSecondArrow = (TextView) holder.singleII.findViewById(R.id.arrow);
        TextView tvThirdArrow = (TextView) holder.singleIII.findViewById(R.id.arrow);
        tvFirstArrow.setVisibility(View.GONE);
        tvSecondArrow.setVisibility(View.VISIBLE);
        tvThirdArrow.setVisibility(View.GONE);

        //显示榜单图片
        String imgUrl = firstSong.getAlbumpic_big();
        holder.sdvCover.setImageURI(Uri.parse(imgUrl));

        return convertView;
    }

    class ViewHolder {
        @Bind(R.id.sdvCover)
        SimpleDraweeView sdvCover;
        @Bind(R.id.tvName)
        TextView tvName;
        @Bind(R.id.singleI)
        View singleI;
        @Bind(R.id.singleII)
        View singleII;
        @Bind(R.id.singleIII)
        View singleIII;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
