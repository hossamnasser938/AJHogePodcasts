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
        this.subject = subject;
        this.duration = duration;
        this.author = context.getResources().getString(R.string.aj_hoge);
    }

    Podcast(String subject, String author, Duration duration){
        this.subject = subject;
        this.duration = duration;
        this.author = author;
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

    public String getDuration() {
        return duration.getHours() + ":" + duration.getMinutes() + ":" + duration.getSeconds();
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

}
