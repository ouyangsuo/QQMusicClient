package com.mobiletrain.newapp.util;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.mobiletrain.newapp.model.LyricBean;
import com.mobiletrain.newapp.model.QueryBean;
import com.mobiletrain.newapp.model.TopBean;

/**
 * Created by idea on 2016/10/8.
 */
public class JsonUtil {

    public static TopBean parseTopBean(String json) {
        TopBean topBean = null;
        try {
            topBean = new Gson().fromJson(json, TopBean.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return topBean;
    }

    public static QueryBean parseQueryBean(String json) {
        QueryBean queryBean = null;
        try {
            queryBean = new Gson().fromJson(json, QueryBean.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return queryBean;
    }

    public static LyricBean parseLyricBean(String json) {
        LyricBean lyricBean = null;
        try {
            lyricBean = new Gson().fromJson(json, LyricBean.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return lyricBean;
    }
}
