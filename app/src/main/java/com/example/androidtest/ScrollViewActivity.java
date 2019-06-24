package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class ScrollViewActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private ScrollView scrollView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        textView = (TextView)findViewById(R.id.textView);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 1; i <= 100; i++){
            stringBuilder.append("呵呵*"+i+"\n");
        }
        textView.setText(stringBuilder.toString());

        scrollView = (ScrollView)findViewById(R.id.scrollView);


    }
}
