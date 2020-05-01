package com.example.triviamiami;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;

/**
 *  Palmetto Activity
 * @author Louis Alvarez
 */
public class QPalmetto extends AppCompatActivity {

    /**
     * Sets the activity on the screen.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_palmetto);
    }

    /**
     * Ignores the back key
     */
    @Override
    public void onBackPressed(){

    }

    /**
     * If the user selects the correct answer, adds a point to his/ her score.
     * @param view
     */
    public void answer(View view){
        int activityID = 6;

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
        int activityID = 6;

        //inherits functions from ActivitySelector class
        ActivitySelector activityselector = new ActivitySelector();

        //randomly selects next activity
        activityselector.nonAnswer(activityID);

    }
}