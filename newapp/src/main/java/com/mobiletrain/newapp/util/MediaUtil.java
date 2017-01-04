package com.mobiletrain.newapp.util;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.widget.Toast;

import com.mobiletrain.newapp.model.LocalMusic;
import com.mobiletrain.newapp.myinterface.Song;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created by idea on 2016/10/11.
 */
public class MediaUtil {

    public static final String ACTION_PLAYING_STATE_CHANGED = "com.mobiletrain.newapp.action.playingStateChanged";
    public static final String ACTION_PLAYING_SONG_CHANGED = "com.mobiletrain.newapp.action.playingSongChanged";
    public static List<Song> currentList;
    public static Song currentPlayingSong = null;
    public static int currentPosition = -1;
    public static boolean isPlaying = false;
    public static MediaPlayer mediaPlayer;

    public synchronized static void play(final Context context, List<Song> songs, int position, final Handler handler) {
        currentList = songs;
        currentPlayingSong = songs.get(position);
        currentPosition = position;

        String path;
        if (!currentPlayingSong.isIDownloaded()) {
            path = currentPlayingSong.getIDownUrl();//播放在线音乐
        } else {
            path = currentPlayingSong.getIFilePath();//播放本地音乐
        }

        if (mediaPlayer == null) {
            mediaPlayer = new MediaPlayer();
        }

        try {
            mediaPlayer.reset();//设置数据源之前要重置
            if (!currentPlayingSong.isIDownloaded()) {
                mediaPlayer.setDataSource(context, Uri.parse(path));//设置在线播放数据源
            } else {
                mediaPlayer.setDataSource(path);//设置本地播放数据源
            }

            mediaPlayer.prepare();//准备播放（同步）

            mediaPlayer.start();//播放
            isPlaying = true;

            Intent intent = new Intent(ACTION_PLAYING_STATE_CHANGED);
            context.sendBroadcast(intent);

            Intent intent2 = new Intent(ACTION_PLAYING_SONG_CHANGED);
            context.sendBroadcast(intent2);

//            for (DataListener listener : listeners) {
//                listener.onPlayingStateChange();
//            }

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    isPlaying = false;
                    Intent intent = new Intent(ACTION_PLAYING_STATE_CHANGED);
                    context.sendBroadcast(intent);
                    currentPlayingSong = null;

                    playNext(context, handler);
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
            handler.post(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(context, "IllegalStateException", Toast.LENGTH_SHORT).show();
                }
            });
        }

    }

    public static void playOrPause(final Context context, Handler handler) {
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
                isPlaying = false;
            } else {
                mediaPlayer.start();
                isPlaying = true;
            }

            context.sendBroadcast(new Intent(ACTION_PLAYING_STATE_CHANGED));
        } else {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(context, "播放器未就绪", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }


    public static void playNext(final Context context, Handler handler) {
        if (currentList != null) {
            int newPosition = 0;
            while ((newPosition = new Random().nextInt(currentList.size())) == currentPosition) {
                //
            }
            switchSong(context, handler, newPosition);
        } else {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(context, "播放列表空空如也", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public static void playPrevious(final Context context, Handler handler) {
        if (currentList != null) {
            int newPosition = 0;
            while ((newPosition = new Random().nextInt(currentList.size())) == currentPosition) {
            }
            switchSong(context, handler, newPosition);
        } else {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(context, "播放列表空空如也", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    private static void switchSong(Context context, Handler handler, int newPosition) {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        play(context, currentList, newPosition, handler);
    }

    static Set<DataListener> listeners = new HashSet<>();

    static void registerListener(DataListener listener) {
        listeners.add(listener);
    }

    static void unregisterListener(DataListener listener) {
        listeners.remove(listener);
    }

    interface DataListener {
        void onPlayingStateChange();
    }

    public static List<LocalMusic> getLocalMusics(Context context, String dirPath) {
        List<LocalMusic> musics = new ArrayList<>();

        Cursor cursor = context.getContentResolver().query(
                MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
                null,
                MediaStore.Audio.Media.DATA + " like ?",
                new String[]{dirPath + "%"},
                MediaStore.Audio.Media.DEFAULT_SORT_ORDER
        );

        while (cursor.moveToNext()) {
            long id = cursor.getLong(cursor.getColumnIndex(MediaStore.Audio.Media._ID)); // 音乐id
            String title = cursor.getString((cursor.getColumnIndex(MediaStore.Audio.Media.TITLE))); // 音乐标题
            String artist = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.ARTIST)); // 艺术家
            String album = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.ALBUM)); // 专辑
            String displayName = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.DISPLAY_NAME));
            long albumId = cursor.getInt(cursor.getColumnIndex(MediaStore.Audio.Media.ALBUM_ID));
            long duration = cursor.getLong(cursor.getColumnIndex(MediaStore.Audio.Media.DURATION)); // 时长
            long size = cursor.getLong(cursor.getColumnIndex(MediaStore.Audio.Media.SIZE)); // 文件大小
            String filePath = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.DATA)); // 文件路径
            int isMusic = cursor.getInt(cursor.getColumnIndex(MediaStore.Audio.Media.IS_MUSIC)); // 是否为音乐

            if (isMusic != 0) {
                LocalMusic music = new LocalMusic(id, title, artist, album, displayName, albumId, duration, size, filePath);
                musics.add(music);
            }
        }

        return musics;
    }

}
