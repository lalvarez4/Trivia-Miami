package com.example.triviamiami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class QLilPump extends AppCompatActivity {
    int activityID = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_lil_pump);
    }

    @Override
    public void onBackPressed(){

    }

    public void answer(View view, int activityID){

    }

    public void nonAnswer(View view, int activityID){

    }
}
