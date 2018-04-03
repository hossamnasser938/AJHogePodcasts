package com.example.android.ajhogepodcasts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

    private Button sevenRulesBtn;
    private Button podcastsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        sevenRulesBtn = (Button) findViewById(R.id.seven_rules_btn);
        podcastsBtn = (Button) findViewById(R.id.podcasts_btn);

        sevenRulesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , SevenRulesActivity.class);
                startActivity(intent);
            }
        });

        podcastsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , PodcastsActivity.class);
                startActivity(intent);
            }
        });

    }
}
