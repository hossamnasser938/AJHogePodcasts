package com.example.android.ajhogepodcasts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void listRules(View view){
        Intent intent = new Intent(getApplicationContext() , SevenRulesActivity.class);
        startActivity(intent);
    }

    public void listPodcasts(View view){
        Intent intent = new Intent(getApplicationContext() , PodcastsActivity.class);
        startActivity(intent);
    }
}
