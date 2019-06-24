package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

    private ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        //  获取开关按钮
        toggleButton = (ToggleButton)findViewById(R.id.toggleButton);

        //  设置开关按钮事件处理
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                ToggleButton toggleButton = (ToggleButton)compoundButton;
                boolean isChecked = toggleButton.isChecked();
                if(isChecked){
                    Toast.makeText(getApplicationContext(),toggleButton.getTextOn(),Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),toggleButton.getTextOff(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
