package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Click(View view){
        Intent intent = new Intent(this,TextViewActivity.class);
        startActivity(intent);
    }

    public void onButton2Click(View view){
        Intent intent = new Intent(this,EditTextActivity.class);
        startActivity(intent);
    }

    public void onButton3Click(View view){
        Intent intent = new Intent(this,ButtonActivity.class);
        startActivity(intent);
    }

    public void onButton4Click(View view){
        Intent intent = new Intent(this,TextViewActivity.class);
        startActivity(intent);
    }

    public void onButton5Click(View view){
        Intent intent = new Intent(this,ImageViewActivity.class);
        startActivity(intent);
    }

    public void onButton6Click(View view){
        Intent intent = new Intent(this,RadioButtonActivity.class);
        startActivity(intent);
    }

    public void onButton7Click(View view){
        Intent intent = new Intent(this,CheckBoxActivity.class);
        startActivity(intent);
    }

    public void onButton8Click(View view){
        Intent intent = new Intent(this,ToggleButtonActivity.class);
        startActivity(intent);
    }

    public void onButton9Click(View view){
        Intent intent = new Intent(this,SwitchActivity.class);
        startActivity(intent);
    }

    public void onButtonNextClick(View view){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
