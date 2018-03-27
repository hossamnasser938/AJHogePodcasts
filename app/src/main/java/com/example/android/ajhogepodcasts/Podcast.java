package com.example.android.ajhogepodcasts;

import android.content.Context;

/**
 * Created by Hosam on 3/27/2018.
 */

public class Podcast {

    private String subject;
    private String author;
    private Duration duration;

    Podcast(Context context, String subject, Duration duration){
        this.setSubject(subject);
        this.setDuration(duration);
        this.setAuthor(context.getResources().getString(R.string.aj_hoge));
    }

    Podcast(String subject, String author, Duration duration){
        this.setSubject(subject);
        this.setDuration(duration);
        this.setAuthor(author);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
