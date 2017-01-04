package com.mobiletrain.newapp.myinterface;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.mobiletrain.newapp.service.MediaService;

/**
 * Created by idea on 2016/10/13.
 */
public class SongPlayActivity extends AppCompatActivity {

    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder binder) {
            MediaService.MyBinder myBinder = (MediaService.MyBinder) binder;
            mediaService = myBinder.getService();
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };



    protected MediaService mediaService;
    private Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        intent = new Intent(this, MediaService.class);
        startService(intent);
        boolean bindSuccess = bindService(intent, conn, Context.BIND_AUTO_CREATE);
        if(bindSuccess){
            Toast.makeText(this, "媒体服务绑定成功", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "媒体服务绑定失败", Toast.LENGTH_SHORT).show();
        }
    }

}
