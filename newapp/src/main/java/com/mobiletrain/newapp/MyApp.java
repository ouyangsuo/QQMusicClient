package com.mobiletrain.newapp;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by idea on 2016/10/11.
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化壁画（图片加载框架）
        Fresco.initialize(this);
    }

}
