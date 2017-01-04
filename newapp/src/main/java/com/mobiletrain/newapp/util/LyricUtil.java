package com.mobiletrain.newapp.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by idea on 2016/10/13.
 */
public class LyricUtil {

    public static List<Map<String, Object>> parseLyricStrToData(String lyric, int duration) {
        List<Map<String, Object>> data = new ArrayList<>();
        int lineCount = 0;

        String[] temps = lyric.split("\n");
        for (int i = 0; i < temps.length; i++) {
            String str = temps[i];
            if(str.startsWith("[0")){
                String timeStr = str.substring(str.indexOf("[") + 1, str.indexOf("]"));
                long start = DateTimeUtil.parseTimeStrToLong(timeStr);
                String text = str.substring(str.indexOf("]") + 1);
                if(text.trim().equals("")){
                    text = "music";
                }

                HashMap<String, Object> map = new HashMap<>();
                map.put("start",start);
                map.put("text",text);
                map.put("end",null);
                if(i==temps.length-1){
                    map.put("end", ((long) duration));
                }

                if(lineCount > 0){
                    data.get(lineCount - 1).put("end",start);
                }

                data.add(map);
                lineCount ++;
            }
        }

        return data;
    }

    public static String getNonASCIIStr(String lyric){
        lyric = lyric.replaceAll("&#58;", ":");
        lyric = lyric.replaceAll("&#32;", " ");
        lyric = lyric.replaceAll("&#40;", "(");
        lyric = lyric.replaceAll("&#41;", ")");
        lyric = lyric.replaceAll("&#46;", ".");
        lyric = lyric.replaceAll("&#10;", "\n");
        lyric = lyric.replaceAll("&#38;", "&");
        lyric = lyric.replaceAll("&#45;", "-");
        lyric = lyric.replaceAll("&#39;", "'");

        return lyric;
    }

}
