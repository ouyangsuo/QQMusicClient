package com.mobiletrain.newapp.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by idea on 2016/10/14.
 */
public class NonQuickClickButton extends TextView {

    private long lastTimeMillis;
    private long thisTimeMillis;

    public NonQuickClickButton(Context context) {
        this(context,null);
    }

    public NonQuickClickButton(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public NonQuickClickButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        lastTimeMillis = System.currentTimeMillis();

        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                thisTimeMillis = System.currentTimeMillis();
                if(thisTimeMillis - lastTimeMillis < 1000){
                    Toast.makeText(getContext(), "请不要连续点击", Toast.LENGTH_SHORT).show();
                    lastTimeMillis = thisTimeMillis;

                    return;
                }

                onMeClick();
            }
        });
    }

    protected void onMeClick(){};
}
