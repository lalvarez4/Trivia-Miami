package com.example.triviamiami;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;

public class QGucciMane extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_gucci_mane);
    }

    @Override
    public void onBackPressed(){

    }

    public void answer(View view){
        int activityID = 1;

        //inherits functions from ActivitySelector class
        ActivitySelector activityselector = new ActivitySelector();

        //randomly selects next activity
        //activityselector.answer(activityID);

    }

    /**
     * If the user selects the incorrect answer, adds zero points to his/ her score.
     * @param view
     */
    public void nonAnswer(View view){
        int activityID = 1;

        //inherits functions from ActivitySelector class
        ActivitySelector activityselector = new ActivitySelector();

        //randomly selects next activity
        activityselector.nonAnswer(activityID);

    }
}
