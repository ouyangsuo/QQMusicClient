package com.mobiletrain.newapp.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.View;

import com.mobiletrain.newapp.R;

import java.util.List;
import java.util.Map;

/**
 * Created by idea on 2016/10/13.
 */
public class LrcView extends View {

    private static final String TAG = "test";
    List<Map<String, Object>> data;
    private Paint paint;
    private Paint hPaint;

    private long currentMillis;
    private int currentLinePosition;
    private int width;
    private int height;

    public void setData(List<Map<String, Object>> data) {
        this.data = data;
    }

    public void setCurrentMillis(long currentMillis) {
        this.currentMillis = currentMillis;
    }

    public LrcView(Context context) {
        this(context, null);
    }

    public LrcView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LrcView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaints();
    }

    private void initPaints() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(50);
        paint.setColor(Color.WHITE);

        hPaint = new Paint();
        hPaint.setAntiAlias(true);
        hPaint.setTextSize(50);
        hPaint.setColor(getResources().getColor(R.color.toolbarGreen));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        Log.e(TAG, "LrcView onDraw: ");

        //拿到控件宽高
        if (width == 0 || height == 0) {
            width = getWidth();
            height = getHeight();
        }

        //无数据时
        if (data == null) {
            drawTextCenter(canvas, "暂无歌词", paint);
            return;
        }

        //找到当前行号
        for (int i = 0; i < data.size(); i++) {
            Map<String, Object> map = data.get(i);
            Long start = (Long) map.get("start");
            Long end = (Long) map.get("end");
            if (currentMillis >= start && currentMillis <= end) {
                currentLinePosition = i;
                break;
            }
        }

        //将当前行高亮画在正中间
        drawCurrentLine(canvas, null);

//        Log.e(TAG, "onDraw:3");
        //向上下各画10行
        drawOtherLines(canvas);

    }

    private void drawOtherLines(Canvas canvas) {
        for (int i = currentLinePosition + 1; i < currentLinePosition + 11; i++) {
            if (i > -1 && i < data.size()) {
                String text = (String) data.get(i).get("text");
                Rect rect = new Rect();
                hPaint.getTextBounds(text, 0, text.length(), rect);
                canvas.drawText(text, width / 2 - rect.width() / 2, height / 2 + rect.height() / 2 + 80 * (i - currentLinePosition), paint);
            }
        }
        for (int i = currentLinePosition - 1; i > currentLinePosition - 11; i--) {
            if (i > -1 && i < data.size()) {
                String text = (String) data.get(i).get("text");
                Rect rect = new Rect();
                hPaint.getTextBounds(text, 0, text.length(), rect);
                canvas.drawText(text, width / 2 - rect.width() / 2, height / 2 + rect.height() / 2 - 80 * (currentLinePosition - i), paint);
            }
        }
    }

    @NonNull
    private void drawCurrentLine(Canvas canvas, String text) {
        long start = (long) data.get(currentLinePosition).get("start");
        long end = (long) data.get(currentLinePosition).get("end");
        String line = (String) data.get(currentLinePosition).get("text");
        if (listener != null) {
            listener.onLyricChanged(start, end, currentMillis, line);
        } else {
            drawTextCenter(canvas, line, hPaint);
        }
    }

    private void drawTextCenter(Canvas canvas, String text, Paint p) {
        Rect rect = new Rect();
        hPaint.getTextBounds(text, 0, text.length(), rect);
        canvas.drawText(text, width / 2 - rect.width() / 2, height / 2 + rect.height() / 2, p);
    }

    OnLyricChangedListener listener;

    public void setListener(OnLyricChangedListener listener) {
        this.listener = listener;
    }

    public interface OnLyricChangedListener {
        void onLyricChanged(long start, long end, long currentMillis, String text);
    }

}
