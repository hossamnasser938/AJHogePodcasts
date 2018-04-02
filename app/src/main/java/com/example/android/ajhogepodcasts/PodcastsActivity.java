package com.example.android.ajhogepodcasts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PodcastsActivity extends AppCompatActivity {

    ArrayList<Podcast> podcasts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcasts);

        podcasts = new ArrayList<>();
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast1_subject), new Duration(0, 20, 56)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast2_subject), new Duration(0, 45, 41)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast3_subject), new Duration(0, 27, 20)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast4_subject), new Duration(0, 25, 53)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast5_subject), new Duration(0, 22, 42)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast6_subject), new Duration(0, 25, 54)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast7_subject), new Duration(0, 38, 17)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast8_subject), new Duration(0, 37, 41)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast9_subject), new Duration(0, 37, 44)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast10_subject), new Duration(0, 47, 25)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast11_subject), new Duration(0, 26, 29)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast12_subject), new Duration(0, 38, 12)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast13_subject), new Duration(0, 34, 16)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast14_subject), new Duration(0, 36, 10)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast15_subject), new Duration(0, 27, 59)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast16_subject), new Duration(0, 28, 4)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast17_subject), new Duration(0, 26, 47)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast18_subject), new Duration(0, 28, 35)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast19_subject), new Duration(0, 16, 18)));
        podcasts.add(new Podcast(this , getResources().getString(R.string.podcast20_subject), new Duration(0, 26, 3)));

        PodcastAdapter adapter = new PodcastAdapter(this , podcasts);

        ListView podcastsList = (ListView) findViewById(R.id.podcasts_list);
        podcastsList.setAdapter(adapter);

    }
}
