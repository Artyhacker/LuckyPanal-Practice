package com.dh.luckypanal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private LuckyPanal mLuckyPanal;
    private ImageView mStartBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLuckyPanal = (LuckyPanal) findViewById(R.id.id_luckyPanal);
        mStartBtn = (ImageView) findViewById(R.id.id_start_btn);
        mStartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mLuckyPanal.isStart()){
                    mLuckyPanal.luckyStart();
                    mStartBtn.setImageResource(R.mipmap.stop);
                } else {
                    if( !mLuckyPanal.isShouldEnd()){
                        mLuckyPanal.luckyEnd();
                        mStartBtn.setImageResource(R.mipmap.start);
                    }
                }
            }
        });
    }
}
