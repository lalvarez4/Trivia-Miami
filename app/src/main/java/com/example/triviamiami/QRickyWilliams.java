package com.example.triviamiami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class QRickyWilliams extends AppCompatActivity {
    int activityID = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_ricky_williams);
    }

    @Override
    public void onBackPressed(){

    }

    public void answer(View view, int activityID){

    }

    public void nonAnswer(View view, int activityID){

    }
}
