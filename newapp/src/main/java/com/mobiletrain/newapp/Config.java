package com.mobiletrain.newapp;

import android.os.Environment;

import java.io.File;

/**
 * Created by idea on 2016/10/12.
 */
public class Config {


    public static final String DOWNLOAD_DIR_PATH = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath()+ File.separator+"qqmusic1605";
}
