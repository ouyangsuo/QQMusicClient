package com.mobiletrain.newapp.fragment.main;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.mobiletrain.newapp.Config;
import com.mobiletrain.newapp.R;
import com.mobiletrain.newapp.adapter.LocalMusicAdapter;
import com.mobiletrain.newapp.model.LocalMusic;
import com.mobiletrain.newapp.myinterface.Song;
import com.mobiletrain.newapp.myinterface.SongPlayerFragment;
import com.mobiletrain.newapp.util.MediaUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnItemClick;
import in.srain.cube.views.ptr.PtrClassicDefaultHeader;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;

/**
 * Created by idea on 2016/10/9.
 */
public class MineFragment extends SongPlayerFragment {

    private static final String TAG = "test";
    @Bind(R.id.lvLocalMusics)
    ListView lvLocalMusics;
    private View view;
    private List<LocalMusic> localMusics = new ArrayList<>();
    private LocalMusicAdapter adapter;
    private PtrFrameLayout ptrfl;

    private Handler handler = new Handler();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getData();
    }

    private void getData() {
        List<LocalMusic> list = MediaUtil.getLocalMusics(getActivity(), Config.DOWNLOAD_DIR_PATH);
        localMusics.clear();
        localMusics.addAll(list);
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_mine, container, false);
            ptrfl = ((PtrFrameLayout) view.findViewById(R.id.ptrfl));
            ButterKnife.bind(this, view);

            adapter = new LocalMusicAdapter(getActivity(), localMusics);
            lvLocalMusics.setAdapter(adapter);

            initPtrFrameLayout();
        }

        return view;
    }

    private void initPtrFrameLayout() {
        PtrClassicDefaultHeader header = new PtrClassicDefaultHeader(getContext());
        ptrfl.setHeaderView(header);
        ptrfl.addPtrUIHandler(header);
        ptrfl.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                doRefresh();
            }
        });
    }

    private void doRefresh() {
        Toast.makeText(getContext(), "开始刷新...", Toast.LENGTH_SHORT).show();
        getData();
        ptrfl.refreshComplete();//刷新结束
        Toast.makeText(getContext(), "数据已更新", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnItemClick(R.id.lvLocalMusics)
    public void onLvLocalMusicsItemClick(AdapterView<?> parent, View view, int position, long id) {
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < localMusics.size(); i++) {
            songs.add(localMusics.get(i));
        }

        if (songPlayer != null) {
            songPlayer.play(songs, position);
        }
    }

}
