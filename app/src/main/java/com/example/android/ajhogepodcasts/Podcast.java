package com.example.android.ajhogepodcasts;

import android.content.Context;

/**
 * Created by Hosam on 3/27/2018.
 */

public class Podcast {

    private String ruleNumber;
    private String subject;
    private String author;
    private Duration duration;

    Podcast(Context context, String ruleNumber, String subject, Duration duration){
        this.ruleNumber = ruleNumber;
        this.subject = subject;
        this.duration = duration;
        this.author = context.getResources().getString(R.string.aj_hoge);
    }

    Podcast(String ruleNumber, String subject, String author, Duration duration){
        this.ruleNumber = ruleNumber;
        this.subject = subject;
        this.duration = duration;
        this.author = author;
    }

    public String getRuleNumber() {
        return ruleNumber;
    }

    public void setRuleNumber(String ruleNumbeer) {
        this.ruleNumber = ruleNumbeer;
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
