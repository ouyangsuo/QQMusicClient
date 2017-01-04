package com.mobiletrain.newapp.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.support.v7.app.NotificationCompat;

import com.mobiletrain.newapp.MainActivity;
import com.mobiletrain.newapp.R;
import com.mobiletrain.newapp.myinterface.Song;
import com.mobiletrain.newapp.util.MediaUtil;
import com.mobiletrain.newapp.util.ThreadUtil;

import java.util.List;

/**
 * Created by idea on 2016/10/13.
 */
public class MediaService extends Service {

    private Handler handler;

    @Override
    public void onCreate() {
        super.onCreate();

        handler = new Handler();

        Notification notification = initNotification();
        startForeground(1,notification);
    }

    private Notification initNotification() {
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 1, new Intent(this, MainActivity.class), PendingIntent.FLAG_ONE_SHOT);
        Notification notification = new NotificationCompat.Builder(this)

                .setDefaults(Notification.DEFAULT_ALL)
                .setSmallIcon(R.mipmap.mymusic_ii)
                .setTicker("ticker")

                .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.mymusic))
                .setContentTitle("content title")
                .setContentText("content text")

                .setAutoCancel(true)
                .setContentIntent(pendingIntent)

                .build();

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(1,notification);
        return notification;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }

    public  void play(final Context context, final List<Song> songs, final int position) {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {
                MediaUtil.play(context,songs,position,handler);
            }
        });
    }

    public  void playOrPause(final Context context) {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {
                MediaUtil.playOrPause(context,handler);
            }
        });
    }

    public  void playNext(final Context context) {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {
                MediaUtil.playNext(context,handler);
            }
        });
    }

    public  void playPrevious(final Context context) {
        ThreadUtil.execute(new Runnable() {
            @Override
            public void run() {
                MediaUtil.playPrevious(context,handler);
            }
        });
    }

    public class MyBinder extends Binder {

        public MediaService getService() {
            return MediaService.this;
        }
    }

}
