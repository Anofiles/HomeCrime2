package com.example.homecrime2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

     CardView mCardViewCrime;
     CardView mCardViewSuspect;
     CardView mCardViewStatistic;
     CardView mCardViewCodex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCardViewCrime=findViewById(R.id.activity_main_crime);
        mCardViewCrime.setOnClickListener(this);
        mCardViewSuspect=findViewById(R.id.activity_main_suspect);
        mCardViewSuspect.setOnClickListener(this);
        mCardViewStatistic=findViewById(R.id.activity_main_statistic);
        mCardViewStatistic.setOnClickListener(this);
        mCardViewCodex=findViewById(R.id.activity_main_codex);
        mCardViewCodex.setOnClickListener(this);
         }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.activity_main_crime:
             startActivity(1);
            break;
            case R.id.activity_main_codex:
             startActivity(2);
            break;
            case R.id.activity_main_statistic:
             startActivity(3);
            break;
            case R.id.activity_main_suspect:
             startActivity(4);
            break;
        }
    }
    public void startActivity(int x){
        Intent intent=new Intent(this,DuoActivity.class);
        intent.putExtra(DuoActivity.DUO_ACTIVITY,x);
        startActivity(intent);
    }
}
