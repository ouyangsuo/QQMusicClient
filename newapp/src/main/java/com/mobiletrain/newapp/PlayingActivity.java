package com.mobiletrain.newapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;
import com.mobiletrain.newapp.model.LyricBean;
import com.mobiletrain.newapp.myinterface.SongPlayActivity;
import com.mobiletrain.newapp.util.DateTimeUtil;
import com.mobiletrain.newapp.util.HttpUtil;
import com.mobiletrain.newapp.util.JsonUtil;
import com.mobiletrain.newapp.util.LyricUtil;
import com.mobiletrain.newapp.util.MediaUtil;
import com.mobiletrain.newapp.util.ThreadUtil;
import com.mobiletrain.newapp.widget.LrcView;
import com.mobiletrain.newapp.widget.TextProgressBar;

import java.util.List;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PlayingActivity extends SongPlayActivity implements LrcView.OnLyricChangedListener {

    private static final int MSG_LYRIC_GOT = 40;
    private static final String TAG = "test";
    @Bind(R.id.sdvCover)
    SimpleDraweeView sdvCover;
    @Bind(R.id.tvBack)
    TextView tvBack;
    @Bind(R.id.tvSongName)
    TextView tvSongName;
    @Bind(R.id.tvMore)
    TextView tvMore;
    @Bind(R.id.lrcView)
    LrcView lrcView;
    @Bind(R.id.textProgressBar)
    TextProgressBar textProgressBar;
    @Bind(R.id.llDots)
    LinearLayout llDots;
    @Bind(R.id.tvCurrentTime)
    TextView tvCurrentTime;
    @Bind(R.id.seekbar)
    SeekBar seekbar;
    @Bind(R.id.tvTotalTime)
    TextView tvTotalTime;
    @Bind(R.id.llProgress)
    LinearLayout llProgress;
    @Bind(R.id.tvPrevious)
    TextView tvPrevious;
    @Bind(R.id.tvPlayPause)
    TextView tvPlayPause;
    @Bind(R.id.tvNext)
    TextView tvNext;
    @Bind(R.id.llControl)
    LinearLayout llControl;
    @Bind(R.id.cbFavorite)
    CheckBox cbFavorite;
    @Bind(R.id.tvMode)
    TextView tvMode;
    @Bind(R.id.tvDownloaded)
    TextView tvDownloaded;
    @Bind(R.id.tvShare)
    TextView tvShare;
    @Bind(R.id.tvList)
    TextView tvList;
    @Bind(R.id.llBottom)
    LinearLayout llBottom;
    @Bind(R.id.flRoot)
    FrameLayout flRoot;

    //歌词相关
    private int duration;
    private Runnable updateProgressRunnable = new Runnable() {
        @Override
        public void run() {
            autoUpdateSeekBar();
        }
    };
    private String lyric;

    //广播相关
    private MyReceiver myReceiver;
    private IntentFilter intentFilter;

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case MSG_LYRIC_GOT:
                    String json = (String) msg.obj;
                    LyricBean lyricBean = JsonUtil.parseLyricBean(json);
                    if (lyricBean != null && lyricBean.getShowapi_res_body().getLyric()!=null) {
                        dealWithLyric(lyricBean);
                    }
                    break;
            }
        }
    };

    private void dealWithLyric(LyricBean lyricBean) {
        if (lyric != null) {
            return;
        }

        lyric = lyricBean.getShowapi_res_body().getLyric();
        lyric = LyricUtil.getNonASCIIStr(lyric);

        int duration = MediaUtil.mediaPlayer.getDuration();
        List<Map<String, Object>> data = LyricUtil.parseLyricStrToData(lyric, duration);
        Log.e(TAG, "data=" + data);

        if (data != null && data.size() > 0) {
            lrcView.setData(data);
            atuoUpdateLrcView();
        } else {
            Toast.makeText(PlayingActivity.this, "歌词获取失败", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);
        ButterKnife.bind(this);

        initLrcView();
        lrcViewShowCurrentPlayingSong();
        updatePlayingState();
    }

    private void initLrcView() {
        lrcView.setListener(this);

        textProgressBar.setVisibility(View.VISIBLE);
        textProgressBar.setBgColor(Color.WHITE);
        textProgressBar.setFgColor(getResources().getColor(R.color.toolbarGreen));
        textProgressBar.setTextSize(50);
    }

    private void lrcViewShowCurrentPlayingSong() {
        if (MediaUtil.currentPlayingSong == null) {
            lyric = null;
            return;
        }

        if (lyric == null) {
            getLyric();
        } else {
            atuoUpdateLrcView();
        }
    }

    private void updatePlayingState() {
        if (MediaUtil.mediaPlayer != null && MediaUtil.currentPlayingSong != null) {
            showCurrentPlayigSongInfo();
            initSeekBarListener();
            autoUpdateSeekBar();
        }
    }

    private void initSeekBarListener() {
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int progress = seekBar.getProgress();
                MediaUtil.mediaPlayer.seekTo((int) (duration * (progress / 100f)));
            }
        });
    }

    private void showCurrentPlayigSongInfo() {
        tvSongName.setText(MediaUtil.currentPlayingSong.getISongname());
        duration = MediaUtil.mediaPlayer.getDuration();
        tvTotalTime.setText(DateTimeUtil.durationMillisToString(duration));
        tvCurrentTime.setText(DateTimeUtil.durationMillisToString(MediaUtil.mediaPlayer.getCurrentPosition()));

        if (MediaUtil.isPlaying) {
            tvPlayPause.setBackgroundResource(R.mipmap.pause_big);
        } else {
            tvPlayPause.setBackgroundResource(R.mipmap.play_big);
        }
    }

    private void autoUpdateSeekBar() {
        int currentPosition = MediaUtil.mediaPlayer.getCurrentPosition();
        tvCurrentTime.setText(DateTimeUtil.durationMillisToString(currentPosition));
        int progress = (int) (currentPosition * 100 / (float) duration);
        seekbar.setProgress(progress);

        if (MediaUtil.mediaPlayer != null && MediaUtil.mediaPlayer.isPlaying() && !activityStopped) {
            handler.postDelayed(updateProgressRunnable, 1000);
        }
    }

    private void getLyric() {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {
                String json = HttpUtil.getLyric(MediaUtil.currentPlayingSong.getISongId());
                Message msg = handler.obtainMessage();
                msg.what = MSG_LYRIC_GOT;
                msg.obj = json;
                handler.sendMessage(msg);
            }
        });
    }

    private void atuoUpdateLrcView() {
        lrcView.setCurrentMillis(MediaUtil.mediaPlayer.getCurrentPosition());
        lrcView.invalidate();

        if (!MediaUtil.isPlaying) {
            return;
        }

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                atuoUpdateLrcView();
            }
        }, 100);
    }

    boolean activityStopped = false;

    @Override
    protected void onStop() {
        super.onStop();
        activityStopped = true;

        if (myReceiver != null) {
            unregisterReceiver(myReceiver);
        }
    }

    @OnClick(R.id.tvPlayPause)
    public void onTvPlayPauseClick() {
//        MediaUtil.playOrPause(this);
        if (mediaService != null) {
            mediaService.playOrPause(this);
        }

        //把本次的更新进度的递归停下来
        handler.removeCallbacks(updateProgressRunnable);
    }

    @OnClick(R.id.tvNext)
    public void onTvNextClick() {
//        MediaUtil.playNext(this);//lint
        if (mediaService != null) {
            mediaService.playNext(this);
        }
    }

    @OnClick(R.id.tvPrevious)
    public void onTvPreviousClick() {
//        MediaUtil.playPrevious(this);
        if (mediaService != null) {
            mediaService.playPrevious(this);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (myReceiver == null || intentFilter == null) {
            myReceiver = new MyReceiver();
            intentFilter = new IntentFilter();
            intentFilter.addAction(MediaUtil.ACTION_PLAYING_STATE_CHANGED);
            intentFilter.addAction(MediaUtil.ACTION_PLAYING_SONG_CHANGED);
        }
        registerReceiver(myReceiver, intentFilter);
    }

    @Override
    public void onLyricChanged(long start, long end, long currentMillis, String text) {
        if (text == null) {
            return;
        }

        int progress = (int) ((currentMillis - start) * 100f / (end - start));
//        Log.e(TAG, "s/e/c/p" + start + "/" + end + "/" + currentMillis + "/" + progress);
        if (progress > 0 && progress < 99) {
            textProgressBar.setVisibility(View.VISIBLE);

            textProgressBar.setText(text);
            textProgressBar.setProgress(progress);
        } else {
            textProgressBar.setVisibility(View.GONE);

            textProgressBar.setText("");
            textProgressBar.setProgress(0);
        }

        textProgressBar.invalidate();
    }

    class MyReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (MediaUtil.ACTION_PLAYING_STATE_CHANGED.equals(action)) {
                updatePlayingState();
                lrcViewShowCurrentPlayingSong();
            } else if (MediaUtil.ACTION_PLAYING_SONG_CHANGED.equals(action)) {
                lyric = null;
                getLyric();
            }
        }
    }

}
