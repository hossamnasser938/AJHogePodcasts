package com.example.android.ajhogepodcasts;

import android.content.Context;

/**
 * Created by Hosam on 3/30/2018.
 */

public class Rule extends Podcast {

    private String ruleNumber;

    Rule(Context context, String ruleNumber, String subject, Duration duration){
        super(context , subject , duration);
        this.ruleNumber = ruleNumber;
    }

    Rule(String ruleNumber, String subject, String author, Duration duration){
        super(subject ,author, duration);
        this.ruleNumber = ruleNumber;
    }

    public String getRuleNumber() {
        return ruleNumber;
    }

    public void setRuleNumber(String ruleNumbeer) {
        this.ruleNumber = ruleNumbeer;
    }

}
