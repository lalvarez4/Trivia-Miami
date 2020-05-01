package com.example.triviamiami;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class ActivitySelector extends AppCompatActivity {
    /**
     * Default constructor
     */
    public ActivitySelector(){

    }

    /**
     * If the user selects the correct answer, adds a point to his/ her score.
     * @param activityID the unique ID of the activity
     */
    public void answer(int activityID){
        System.out.println("WTF");

        Random random = new Random();

        ArrayList<Integer> activityList = (ArrayList<Integer>)getIntent().getSerializableExtra("activityArray");

        System.out.println("WTF ARRAYS");

        //After user clicks on what he/she thinks is the answer, this for loop removes this
        //activity from the list of possible activities to follow
        for(int i = 0; i < activityList.size(); i++){
            if(activityList.get(i) == activityID){
                activityList.set(i, -1);
            }
        }
        //sets the limit to 7 questions
        int limit = 0;
        for(int i = 0; i < activityList.size(); i++){
            if(activityList.get(i) == -1){
                limit++;
            }
        }
        if(limit == 7){
            Intent scorepage = new Intent(this, ScoringPage.class);
            startActivity(scorepage);
        }

        Intent intent = new Intent();
        intent.putExtra("activityArray", activityList);

        switch (randomActivity(random, activityList)){
            case 0:
                intent = new Intent(this, QArtBasel.class);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(this, QGucciMane.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(this, QHardRockStadium.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(this, QHurricaneSeason.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(this, QLilPump.class);
                startActivity(intent);
                break;
            case 5:
                intent = new Intent(this, QLilWayne.class);
                startActivity(intent);
                break;
            case 6:
                intent = new Intent(this, QPalmetto.class);
                startActivity(intent);
                break;
            case 7:
                intent = new Intent(this, QPitbull.class);
                startActivity(intent);
                break;
            case 8:
                intent = new Intent(this, QRickyWilliams.class);
                startActivity(intent);
                break;
            case 9:
                intent = new Intent(this, QScarface.class);
                startActivity(intent);
                break;
            case 10:
                intent = new Intent(this, QTheHeatles.class);
                startActivity(intent);
                break;
        }

    }

    /**
     * If the user selects the correct answer, adds a point to his/ her score.
     * @param activityID the unique ID of the activity
     */
    public void nonAnswer(int activityID){
        Random random = new Random();

        Intent intent = getIntent();
        ArrayList<Integer> activityList = intent.getIntegerArrayListExtra("ARRAY");

        //After user clicks on what he/she thinks is the answer, this for loop removes this
        //activity from the list of possible activities to follow
        for(int i = 0; i < activityList.size(); i++){
            if(activityList.get(i) == activityID){
                activityList.set(i, -1);
            }
        }

        //sets the limit to 7 questions
        int limit = 0;
        for(int i = 0; i < activityList.size(); i++){
            if(activityList.get(i) == -1){
                limit++;
            }
        }
        if(limit == 7){
            Intent scorepage = new Intent(this, ScoringPage.class);
            startActivity(scorepage);
        }

        switch (randomActivity(random, activityList)){
            case 0:
                intent = new Intent(this, QArtBasel.class);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(this, QGucciMane.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(this, QHardRockStadium.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(this, QHurricaneSeason.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(this, QLilPump.class);
                startActivity(intent);
                break;
            case 5:
                intent = new Intent(this, QLilWayne.class);
                startActivity(intent);
                break;
            case 6:
                intent = new Intent(this, QPalmetto.class);
                startActivity(intent);
                break;
            case 7:
                intent = new Intent(this, QPitbull.class);
                startActivity(intent);
                break;
            case 8:
                intent = new Intent(this, QRickyWilliams.class);
                startActivity(intent);
                break;
            case 9:
                intent = new Intent(this, QScarface.class);
                startActivity(intent);
                break;
            case 10:
                intent = new Intent(this, QTheHeatles.class);
                startActivity(intent);
                break;
        }

    }

    /**
     * Recursively calls itself until the random number isn't the index whose value == -1
     * Used to find the next activity.
     * @param random
     * @param activityList List of all activities
     * @return The index of the arraylist whose value != -1
     */
    public int randomActivity(Random random, ArrayList<Integer> activityList){
        int activity;
        activity = random.nextInt(activityList.size()); //gets a random index from the array
        if(activityList.get(activity) == -1){ //if the value at the index == -1, call randomActivity()
            randomActivity(random, activityList);
        }
        return activity;
    }
}
