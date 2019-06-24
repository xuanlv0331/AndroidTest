package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onButtonPreviousClick(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void onButton10Click(View view){
        Intent intent = new Intent(this,ProgressBarActivity.class);
        startActivity(intent);
    }

    public void onButton11Click(View view){
        Intent intent = new Intent(this,SeekBarActivity.class);
        startActivity(intent);
    }

    public void onButton12Click(View view){
        Intent intent = new Intent(this,RatingBarActivity.class);
        startActivity(intent);
    }

    public void onButton13Click(View view){
        Intent intent = new Intent(this,ScrollViewActivity.class);
        startActivity(intent);
    }

    public void onButton14Click(View view){
        Intent intent = new Intent(this,DateTimeActivity.class);
        startActivity(intent);
    }

    public void onButton15Click(View view){
        Intent intent = new Intent(this,TextViewActivity.class);
        startActivity(intent);
    }

    public void onButton16Click(View view){
        Intent intent = new Intent(this,TextViewActivity.class);
        startActivity(intent);
    }

    public void onButton17Click(View view){
        Intent intent = new Intent(this,ListViewActivity.class);
        startActivity(intent);
    }

    public void onButton18Click(View view){
        Intent intent = new Intent(this,ListViewActivity.class);
        startActivity(intent);
    }

    public void onButtonNextClick(View view){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
