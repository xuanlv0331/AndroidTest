package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class SwitchActivity extends AppCompatActivity {

    private Switch switch1;
    private Switch switch2;
    private Switch switch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        //  获取开关
        switch1 = (Switch)findViewById(R.id.switch1);
        switch2 = (Switch)findViewById(R.id.switch2);
        switch3 = (Switch)findViewById(R.id.switch3);

        //  设置开关事件处理
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Switch switch1 = (Switch)compoundButton;
                boolean isChecked = switch1.isChecked();
                if(isChecked){
                    Toast.makeText(getApplicationContext(),"开关1:ON",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"开关1:OFF",Toast.LENGTH_SHORT).show();
                }
            }
        });
        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Switch switch2 = (Switch)compoundButton;
                boolean isChecked = switch2.isChecked();
                if(isChecked){
                    Toast.makeText(getApplicationContext(),"开关2:ON",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"开关2:OFF",Toast.LENGTH_SHORT).show();
                }
            }
        });
        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Switch switch3 = (Switch)compoundButton;
                boolean isChecked = switch3.isChecked();
                if(isChecked){
                    Toast.makeText(getApplicationContext(),"开关3:ON",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"开关3:OFF",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
