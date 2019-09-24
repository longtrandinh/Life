package com.gmail.life;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CityDetailActive extends AppCompatActivity {
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_detail_active);
        Intent intent = getIntent();
        String cityStr = intent.getStringExtra("cityName");

        TextView cityNameTV = findViewById(R.id.cityName);
        TextView cityDescription = findViewById(R.id.cityDescription);
        cityNameTV.setText(cityStr);
        cityDescription.setText(cityStr+ " is a very bad");

    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "==OnCreate Called==");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "==OnResume Called==");

    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "==OnPause Called==");

    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG,"==OnStop Called==");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "==OnDestroy Called==");
    }
}
