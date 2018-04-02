package com.example.android.ajhogepodcasts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hosam on 4/2/2018.
 */

public class PodcastAdapter extends ArrayAdapter<Podcast> {

    public PodcastAdapter(Context context , ArrayList<Podcast> podcasts){
        super(context , 0 , podcasts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        Podcast podcast = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.podcast_layout, parent, false);
        }

        TextView podcastSubject = (TextView) convertView.findViewById(R.id.podcast_title);
        TextView podcastAuthor = (TextView) convertView.findViewById(R.id.podcast_author);
        TextView podcastDuration = (TextView) convertView.findViewById(R.id.podcast_duration);

        podcastSubject.setText(podcast.getSubject());
        podcastAuthor.setText(podcast.getAuthor());
        podcastDuration.setText(podcast.getDuration());

        return convertView;

    }
}
