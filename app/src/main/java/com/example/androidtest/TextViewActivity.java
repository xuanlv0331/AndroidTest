package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        //  带链接的文本框
        TextView textView5 = (TextView)findViewById(R.id.textView5);
        textView5.setAutoLinkMask(Linkify.ALL);
        textView5.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
