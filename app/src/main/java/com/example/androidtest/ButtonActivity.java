package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity {

    private Button button1;
    private Button button1_control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        button1 = (Button)findViewById(R.id.button1);
        button1_control = (Button)findViewById(R.id.button1_control);
        button1_control.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View view){
                button1.setEnabled(!button1.isEnabled());
                updateButton1();
            }
        });
        updateButton1();
    }

    public void updateButton1(){
        if(button1.isEnabled()) {
            button1_control.setText("按钮可用");
        }
        else {
            button1_control.setText("按钮不可用");
        }
    }
}
