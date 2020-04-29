package com.example.triviamiami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class QArtBasel extends AppCompatActivity {
    int activityID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_art_basel);
    }

    @Override
    public void onBackPressed(){

    }

    public void answer(View view, int activityID){
        Pathfinder pathfinder = new Pathfinder();
    }

    public void nonAnswer(View view, int activityID){

    }
}
