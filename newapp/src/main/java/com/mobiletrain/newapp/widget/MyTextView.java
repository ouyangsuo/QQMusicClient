package com.mobiletrain.newapp.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by idea on 2016/10/13.
 */
public class MyTextView extends TextView {

    private static final String TAG = "test";

    public MyTextView(Context context) {
        this(context,null);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e(TAG, "MyTextView onDraw: ");
    }
}
