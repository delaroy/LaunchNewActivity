package com.delaroystudios.weatherapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.delaroystudios.weatherapp.R;

// COMPLETED (1) Create a new Activity called DetailActivity using Android Studio's wizard
public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #WeatherApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}