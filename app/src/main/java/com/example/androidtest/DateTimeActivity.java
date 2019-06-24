package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;

public class DateTimeActivity extends AppCompatActivity {

    private Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);

        chronometer = (Chronometer)findViewById(R.id.chronometer);
        chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener(){

            @Override
            public void onChronometerTick(Chronometer chronometer){

            }
        });
    }

    public void onButton1Click(View view){
        chronometer.start();
    }

    public void onButton2Click(View view){
        chronometer.stop();
    }

    public void onButton3Click(View view){
        chronometer.setBase(SystemClock.elapsedRealtime());
    }
}
