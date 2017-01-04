package com.mobiletrain.newapp.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by idea on 2016/10/14.
 */
public class MyBitmapUtil {

    public static Bitmap createTextBitmap(String text, float textSize, int textColor, int bold) {

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);//创建画笔
        paint.setTextSize(textSize);//设置文字的大小
//        paint.setTypeface(Typeface.DEFAULT_BOLD);//文字的样式(加粗)
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(bold);
        paint.setColor(textColor);//文字的颜色

        Rect rect = new Rect();
        paint.getTextBounds(text, 0, text.length(), rect);

//        float textWidth = paint.measureText(text);
//        float textHeight = textWidth / text.length();
//        float height = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, textSize, context.getResources().getDisplayMetrics());
//        Bitmap bitmap = Bitmap.createBitmap((int) textWidth, (int) textHeight, Bitmap.Config.ARGB_8888);//创建一个宽度和高度都是400、32位ARGB图

        int width = rect.width();
        width = width > 0 ? width : 1;
        int height = rect.height();
        height = height > 0 ? height : 1;

        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);//创建一个宽度和高度都是400、32位ARGB图

        Canvas canvas = new Canvas(bitmap);//初始化画布绘制的图像到icon上
        canvas.drawColor(Color.TRANSPARENT);//图层的背景色
        canvas.drawText(text, 0, rect.height() - 5, paint);//将文字写入。这里面的（120，130）代表着文字在图层上的初始位置
        canvas.save(canvas.ALL_SAVE_FLAG);//保存所有图层
        canvas.restore();

        return bitmap;
    }

	private void blur(Bitmap bkg, View view, float radius) {
//        Bitmap overlay = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
//        Canvas canvas = new Canvas(overlay);
//        canvas.drawBitmap(bkg, -view.getLeft(), -view.getTop(), null);
//        RenderScript rs = RenderScript.create(this);
//        Allocation overlayAlloc = Allocation.createFromBitmap(rs, overlay);
//        ScriptIntrinsicBlur blur = ScriptIntrinsicBlur.create(rs, overlayAlloc.getElement());
//        blur.setInput(overlayAlloc);
//        blur.setRadius(radius);
//        blur.forEach(overlayAlloc);
//        overlayAlloc.copyTo(overlay);
//        view.setBackground(new BitmapDrawable(getResources(), overlay));
//        rs.destroy();
    } 

}
