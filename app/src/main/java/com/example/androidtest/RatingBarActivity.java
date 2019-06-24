package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;

public class RatingBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        RatingBar ratingBar1 = (RatingBar)findViewById(R.id.ratingBar1);
        ratingBar1.setIsIndicator(false);
        ratingBar1.setNumStars(5);
        ratingBar1.setRating(0.0f);
        ratingBar1.setStepSize(0.5f);
        ratingBar1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser){


            }
        });
    }
}
