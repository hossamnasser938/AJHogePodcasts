package com.example.android.ajhogepodcasts;

/**
 * Created by Hosam on 3/27/2018.
 */

public class Duration {

    private int hours;
    private int minutes;
    private int seconds;

    Duration(int hours, int minutes, int seconds){
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
