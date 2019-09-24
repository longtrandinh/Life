package com.gmail.life;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> cities;
    ListView cityLV;
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cities= new ArrayList<>();
        cities.add("DN");
        cities.add("QN");
        cities.add("HN");
        cities.add("HP");
        cityLV=findViewById(R.id.cityListView);
        ArrayAdapter cityAdapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1,cities);
        cityLV.setAdapter(cityAdapter);
        cityLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String city = cities.get(i);
                Intent cityIntent = new Intent(MainActivity.this, CityDetailActive.class);
                cityIntent.putExtra("cityName", city);
                startActivity(cityIntent);

            }
        });
        Log.d(TAG, "==OnCreate Called==");
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
