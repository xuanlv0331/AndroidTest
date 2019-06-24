package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarActivity extends AppCompatActivity {

    private SeekBar seekBar1;
    private TextView seekBar1Description;
    private SeekBar seekBar2;
    private TextView seekBar2Description;
    private SeekBar seekBar3;
    private TextView seekBar3Description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        setupSeekBar1();
        setupSeekBar2();
        setupSeekBar3();
    }

    public void setupSeekBar1(){

        //  获取拖动条1
        seekBar1 = (SeekBar)findViewById(R.id.seekBar1);

        //  设置拖动条1事件处理
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                //  设置拖动条1描述文本
                seekBar1Description.setText("当前进度值:" + seekBar.getProgress() + "/" + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //  获取拖动条1描述
        seekBar1Description = (TextView)findViewById(R.id.seekBar1_description);

        //  设置拖动条1描述文本
        seekBar1Description.setText("当前进度值:" + seekBar1.getProgress() + "/" + seekBar1.getMax());
    }

    public void setupSeekBar2(){

        //  获取拖动条2
        seekBar2 = (SeekBar)findViewById(R.id.seekBar2);

        //  设置拖动条2事件处理
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                //  设置拖动条2描述文本
                seekBar2Description.setText("当前进度值:" + seekBar.getProgress() + "/" + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //  获取拖动条2描述
        seekBar2Description = (TextView)findViewById(R.id.seekBar2_description);

        //  设置拖动条2描述文本
        seekBar2Description.setText("当前进度值:" + seekBar2.getProgress() + "/" + seekBar2.getMax());
    }

    public void setupSeekBar3(){

        //  获取拖动条3
        seekBar3 = (SeekBar)findViewById(R.id.seekBar3);

        //  设置拖动条3事件处理
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                //  设置拖动条3描述文本
                seekBar3Description.setText("当前进度值:" + seekBar.getProgress() + "/" + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //  获取拖动条3描述
        seekBar3Description = (TextView)findViewById(R.id.seekBar3_description);

        //  设置拖动条3描述文本
        seekBar3Description.setText("当前进度值:" + seekBar3.getProgress() + "/" + seekBar3.getMax());
    }
}
