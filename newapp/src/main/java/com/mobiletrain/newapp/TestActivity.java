package com.mobiletrain.newapp;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.mobiletrain.newapp.widget.TextProgressBar;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TestActivity extends AppCompatActivity {

    @Bind(R.id.tpb)
    TextProgressBar tpb;

    private int progress = 0;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);

        updateTextProgressBar();

    }

    private void updateTextProgressBar() {
        tpb.setText("今天是个好日子");
        tpb.setTextSize(50);
        tpb.setBgColor(Color.BLUE);
        tpb.setFgColor(Color.RED);
        tpb.setProgress(++progress);
        tpb.invalidate();

        if(progress>=100){
            progress = 0;
        }

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                updateTextProgressBar();
            }
        }, 50);
    }
}
