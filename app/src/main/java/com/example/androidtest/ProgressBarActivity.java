package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class ProgressBarActivity extends AppCompatActivity {

    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        animationDrawable = (AnimationDrawable)imageView.getDrawable();
        imageView.postDelayed(new Runnable(){
            @Override
            public void run(){
                animationDrawable.start();
            }
        },100);
    }
}
