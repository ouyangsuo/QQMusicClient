package com.mobiletrain.newapp;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.mobiletrain.newapp.fragment.MainFragment;
import com.mobiletrain.newapp.fragment.MoreFragment;
import com.mobiletrain.newapp.fragment.SearchFragment;
import com.mobiletrain.newapp.myinterface.Song;
import com.mobiletrain.newapp.myinterface.SongPlayActivity;
import com.mobiletrain.newapp.myinterface.SongPlayer;
import com.mobiletrain.newapp.util.MediaUtil;
import com.mobiletrain.newapp.util.ScreenUtil;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends SongPlayActivity
        implements MainFragment.OnMainFragmentViewClickListener,
        MoreFragment.OnMoreFragmentViewClickListener,
        SearchFragment.OnSearchFragmentViewClickListener,
        SongPlayer
{

    private static final String TAG = "test";

    @Bind(R.id.flContainer)
    FrameLayout flContainer;
    @Bind(R.id.sdvCover)
    SimpleDraweeView sdvCover;
    @Bind(R.id.tvSongName)
    TextView tvSongName;
    @Bind(R.id.tvSingerAlbum)
    TextView tvSingerAlbum;
    @Bind(R.id.tvPlayPause)
    TextView tvPlayPause;
    @Bind(R.id.tvList)
    TextView tvList;
    @Bind(R.id.llPlaying)
    LinearLayout llPlaying;
    private MainFragment mainFragment;
    private MoreFragment moreFragment;
    private Fragment currentFragment;
    private SearchFragment searchFragment;
    private int currentSongId = -1;
    private MyReceiver myReceiver;
    private IntentFilter intentFilter;
    private ObjectAnimator rotationAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
//        }

        setContentView(R.layout.activity_main);
        int statusBarHeight = ScreenUtil.getStatusBarHeight(getResources());
        findViewById(R.id.vTopExtra).setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, statusBarHeight));
        ButterKnife.bind(this);

        mainFragment = new MainFragment();
        mainFragment.setListener(this);
        currentFragment = mainFragment;
        showFragment(mainFragment, false);

        initRotationAnim();
    }

    @Override
    public void onTvMenuClick() {
        if (moreFragment == null) {
            moreFragment = new MoreFragment();
            moreFragment.setListener(this);
        }
        showFragment(moreFragment, true);
    }

    @Override
    public void onTvSearchClick() {
        if (searchFragment == null) {
            searchFragment = new SearchFragment();
            searchFragment.setListener(this);
            searchFragment.setSongPlayer(this);
        }
        showFragment(searchFragment, true);
    }

    private void showFragment(Fragment fragment, boolean withAnimation) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if (!fragment.isAdded()) {
            ft.add(R.id.flContainer, fragment);
        }
        if (withAnimation == true) {
            if (fragment instanceof MainFragment) {
                ft.setCustomAnimations(R.anim.enter_rightward, R.anim.exit_rightward);
//                mainFragment.vMask.setVisibility(View.GONE);
                mainFragment.showMask(false);
            } else {
                ft.setCustomAnimations(R.anim.enter_leftward, R.anim.exit_leftward);
//                mainFragment.vMask.setVisibility(View.VISIBLE);
                mainFragment.showMask(true);
            }
        }
        ft.hide(currentFragment).show(fragment);
        ft.commit();
        currentFragment = fragment;
    }

    @Override
    public void onMoreFragmentTvBackClick() {
        showFragment(mainFragment, true);
    }

    @Override
    public void onSearchFragmentTvBackClick() {
        showFragment(mainFragment, true);
    }

    @OnClick(R.id.llPlaying)
    public void onLlPlayingClick() {
        Intent intent = new Intent(this, PlayingActivity.class);
        intent.putExtra("songid", currentSongId);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        Log.e(TAG, "onStart: ");
        super.onStart();
        myReceiver = new MyReceiver();
        intentFilter = new IntentFilter();
        intentFilter.addAction("abcdefg");
        intentFilter.addAction("abcdef");
        intentFilter.addAction(MediaUtil.ACTION_PLAYING_STATE_CHANGED);
        registerReceiver(myReceiver, intentFilter);
    }

    @Override
    protected void onStop() {
        Log.e(TAG, "onStop: ");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(myReceiver);
    }

    @Override
    public void play(List<Song> songs, int position) {
        if(mediaService != null){
            mediaService.play(this,songs,position);
        }
    }

    class MyReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Log.e(TAG, "onReceive: " + action);
            if ("abcdef".equals(action)) {

            } else if (MediaUtil.ACTION_PLAYING_STATE_CHANGED.equals(action)) {
                try {
                    updatePlayingState();
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e(TAG, "onReceive:Exception=" + e);
                }
            }
        }
    }

    private void updatePlayingState() {
        Song currentPlayingSong = MediaUtil.currentPlayingSong;
        tvSongName.setText(currentPlayingSong.getISongname());
        tvSingerAlbum.setText(currentPlayingSong.getISingername());
        String imgUrl = currentPlayingSong.getIAlbumpicSmall();
        if (imgUrl != null) {
            sdvCover.setImageURI(Uri.parse(imgUrl));
        }

        if (MediaUtil.isPlaying) {
            tvPlayPause.setBackgroundResource(R.mipmap.pause_big);
            rotationAnimator.start();
        } else {
            tvPlayPause.setBackgroundResource(R.mipmap.play_big);
            Log.e(TAG, "Build.VERSION.SDK_INT=" + Build.VERSION.SDK_INT);
            rotationAnimator.cancel();
//            if (Build.VERSION.SDK_INT > 18) {
//                rotationAnimator.pause();
//            } else {
//                rotationAnimator.cancel();
//            }
        }
    }

    private void initRotationAnim() {
        rotationAnimator = ObjectAnimator.ofFloat(sdvCover, "rotation", 0, 360 * 10000);
        rotationAnimator.setDuration(5000 * 10000);
        rotationAnimator.setRepeatCount(ValueAnimator.INFINITE);
        rotationAnimator.setInterpolator(new LinearInterpolator());
    }

    @OnClick(R.id.tvPlayPause)
    public void onTvPlayPauseClick() {
//        MediaUtil.playOrPause(this);
        if(mediaService!=null){
            mediaService.playOrPause(this);
        }
    }

}
