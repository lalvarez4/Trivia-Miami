package com.example.triviamiami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class QPitbull extends AppCompatActivity {
    int activityID = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_pitbull);
    }

    @Override
    public void onBackPressed(){

    }

    public void answer(View view, int activityID){

    }

    public void nonAnswer(View view, int activityID){

    }
}
