package com.example.android.ajhogepodcasts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SevenRulesActivity extends AppCompatActivity {

    ArrayList<Rule> SevenRules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        SevenRules = new ArrayList<>();

        SevenRules.add(new Rule(getApplicationContext(), getResources().getString(R.string.rule1), getResources().getString(R.string.rule1_subject) , new Duration(0 , 3 , 21)));
        SevenRules.add(new Rule(getApplicationContext(), getResources().getString(R.string.rule2), getResources().getString(R.string.rule2_subject) , new Duration(0 , 3 , 19)));
        SevenRules.add(new Rule(getApplicationContext(), getResources().getString(R.string.rule3), getResources().getString(R.string.rule3_subject) , new Duration(0 , 4 , 5)));
        SevenRules.add(new Rule(getApplicationContext(), getResources().getString(R.string.rule4), getResources().getString(R.string.rule4_subject) , new Duration(0 , 2 , 54)));
        SevenRules.add(new Rule(getApplicationContext(), getResources().getString(R.string.rule5), getResources().getString(R.string.rule5_subject) , new Duration(0 , 5 , 9)));
        SevenRules.add(new Rule(getApplicationContext(), getResources().getString(R.string.rule6), getResources().getString(R.string.rule6_subject) , new Duration(0 , 4 , 12)));
        SevenRules.add(new Rule(getApplicationContext(), getResources().getString(R.string.rule7), getResources().getString(R.string.rule7_subject) , new Duration(0 , 3 , 57)));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven_rules);

        setRuleTexts(0 , R.id.rule1_layout);
        setRuleTexts(1 , R.id.rule2_layout);
        setRuleTexts(2 , R.id.rule3_layout);
        setRuleTexts(3 , R.id.rule4_layout);
        setRuleTexts(4 , R.id.rule5_layout);
        setRuleTexts(5 , R.id.rule6_layout);
        setRuleTexts(6 , R.id.rule7_layout);

    }

    void  setRuleTexts(int index , int id){

        ViewGroup ruleLayout;
        ViewGroup subRuleLayout;
        TextView ruleMiniText;

        ruleLayout = (ViewGroup)findViewById(id);

        ruleMiniText = (TextView) ruleLayout.getChildAt(0);
        ruleMiniText.setText(SevenRules.get(index).getRuleNumber());

        subRuleLayout = (ViewGroup) ruleLayout.getChildAt(1);

        ruleMiniText = (TextView) subRuleLayout.getChildAt(0);
        ruleMiniText.setText(SevenRules.get(index).getAuthor());

        ruleMiniText = (TextView) subRuleLayout.getChildAt(1);
        ruleMiniText.setText(SevenRules.get(index).getSubject());

        ruleMiniText = (TextView) subRuleLayout.getChildAt(2);
        ruleMiniText.setText(SevenRules.get(index).getDuration());

    }

    public void playRule(View view){
        Intent intent = new Intent(getApplicationContext() , NowPlayingActivity.class);
        startActivity(intent);
    }

}
