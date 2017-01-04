package com.mobiletrain.newapp.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import com.mobiletrain.newapp.util.MyBitmapUtil;

/**
 * Created by idea on 2016/10/14.
 */
public class TextProgressBar extends View {

    private static final String TAG = "test";
    String text = "";
    int progress;
    int bgColor = Color.GREEN;
    int fgColor = Color.RED;
    float textSize = 50;
    private Paint bgPaint;
    private Paint fgPaint;

    public void setText(String text) {
        this.text = text;
    }

    public void setProgress(int progress) {
        if (progress < 1) {
            this.progress = 1;
        } else if (progress > 99) {
            this.progress = 99;
        }else {
            this.progress = progress;
        }
    }

    public void setBgColor(int bgColor) {
        this.bgColor = bgColor;
    }

    public void setFgColor(int fgColor) {
        this.fgColor = fgColor;
    }

    public void setTextSize(float textSize) {
        this.textSize = textSize;
    }

    public TextProgressBar(Context context) {
        this(context, null);
    }

    public TextProgressBar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TextProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        bgPaint = new Paint();
        bgPaint.setAntiAlias(true);
        bgPaint.setTextSize(textSize);

        fgPaint = new Paint();
        fgPaint.setAntiAlias(true);
        fgPaint.setTextSize(textSize);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        Log.d(TAG, "onDraw:");

        if ("".equals(text)) {
            return;
        }

        //把文本用背景画笔绘制在屏幕正中间
        darwTextCenter(canvas);

        //得到前景色文字的图片
        Bitmap textBitmap = MyBitmapUtil.createTextBitmap(text, textSize, fgColor, 1);

        //按当前进度截取前景图片，并绘制在背景文字的相同位置
        int width = (int) (textBitmap.getWidth() * (progress / 100f));
        Bitmap progressBitmap = Bitmap.createBitmap(textBitmap, 0, 0, width > textBitmap.getWidth() ? textBitmap.getWidth() : width, textBitmap.getHeight());
        fgPaint.setColor(fgColor);
        canvas.drawBitmap(
                progressBitmap,
                getWidth() / 2 - textBitmap.getWidth() / 2,
                getHeight() / 2 - textBitmap.getHeight() / 2 + 3,
                fgPaint);

    }

    private void darwTextCenter(Canvas canvas) {
        float textWidth = bgPaint.measureText(text);
        Rect textBoundsRect = new Rect();
        bgPaint.getTextBounds(text, 0, text.length(), textBoundsRect);
        bgPaint.setColor(bgColor);
        canvas.drawText(
                text,
                getWidth() / 2 - textBoundsRect.width() / 2,
                getHeight() / 2 + textBoundsRect.height() / 2,
                bgPaint);
    }

}
