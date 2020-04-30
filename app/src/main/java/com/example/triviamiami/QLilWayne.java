package com.example.triviamiami;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;

/**
 * Lil Wayne Activity
 * @author Louis Alvarez
 */
public class QLilWayne extends AppCompatActivity {

    /**
     * Sets the activity on the screen.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_lil_wayne);
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
        int activityID = 5;

        Intent intent = getIntent();
        ArrayList<Integer> activityList = intent.getIntegerArrayListExtra("ARRAY");

        //After user clicks on what he/she thinks is the answer, this for loop removes this
        //activity from the list of possible activities to follow
        for(int i = 0; i < activityList.size(); i++){
            if(activityList.get(i) == activityID){
                activityList.set(i, -1);
            }
        }

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

        Random random = new Random();
        int nextActivity = random.nextInt(activityList.size());
        switch (nextActivity){
            case 0:
                Intent artbasel = new Intent(this, QArtBasel.class);
                artbasel.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(artbasel);
                break;
            case 1:
                Intent guccimane = new Intent(this, QGucciMane.class);
                guccimane.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(guccimane);
                break;
            case 2:
                Intent hardrock = new Intent(this, QHardRockStadium.class);
                hardrock.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(hardrock);
                break;
            case 3:
                Intent hurricaneseason = new Intent(this, QHurricaneSeason.class);
                hurricaneseason.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(hurricaneseason);
                break;
            case 4:
                Intent lilpump = new Intent(this, QLilPump.class);
                lilpump.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(lilpump);
                break;
            case 5:
                Intent lilwayne = new Intent(this, QLilWayne.class);
                lilwayne.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(lilwayne);
                break;
            case 6:
                Intent palmetto = new Intent(this, QPalmetto.class);
                palmetto.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(palmetto);
                break;
            case 7:
                Intent pitbull = new Intent(this, QPitbull.class);
                pitbull.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(pitbull);
                break;
            case 8:
                Intent rickywilliams = new Intent(this, QRickyWilliams.class);
                rickywilliams.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(rickywilliams);
                break;
            case 9:
                Intent scarface = new Intent(this, QScarface.class);
                scarface.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(scarface);
                break;
            case 10:
                Intent heatles = new Intent(this, QTheHeatles.class);
                heatles.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(heatles);
                break;
            default:
                Intent scoringpage = new Intent(this, ScoringPage.class);
                startActivity(scoringpage);
        }

    }

    /**
     * If the user selects the correct answer, adds a point to his/ her score.
     * @param view
     */
    public void nonAnswer(View view){
        int activityID = 5;

        Intent intent = getIntent();
        ArrayList<Integer> activityList = intent.getIntegerArrayListExtra("ARRAY");

        //After user clicks on what he/she thinks is the answer, this for loop removes this
        //activity from the list of possible activities to follow
        for(int i = 0; i < activityList.size(); i++){
            if(activityList.get(i) == activityID){
                activityList.set(i, -1);
            }
        }

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

        Random random = new Random();
        int nextActivity = random.nextInt(activityList.size());
        switch (nextActivity){
            case 0:
                Intent artbasel = new Intent(this, QArtBasel.class);
                artbasel.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(artbasel);
                break;
            case 1:
                Intent guccimane = new Intent(this, QGucciMane.class);
                guccimane.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(guccimane);
                break;
            case 2:
                Intent hardrock = new Intent(this, QHardRockStadium.class);
                hardrock.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(hardrock);
                break;
            case 3:
                Intent hurricaneseason = new Intent(this, QHurricaneSeason.class);
                hurricaneseason.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(hurricaneseason);
                break;
            case 4:
                Intent lilpump = new Intent(this, QLilPump.class);
                lilpump.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(lilpump);
                break;
            case 5:
                Intent lilwayne = new Intent(this, QLilWayne.class);
                lilwayne.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(lilwayne);
                break;
            case 6:
                Intent palmetto = new Intent(this, QPalmetto.class);
                palmetto.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(palmetto);
                break;
            case 7:
                Intent pitbull = new Intent(this, QPitbull.class);
                pitbull.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(pitbull);
                break;
            case 8:
                Intent rickywilliams = new Intent(this, QRickyWilliams.class);
                rickywilliams.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(rickywilliams);
                break;
            case 9:
                Intent scarface = new Intent(this, QScarface.class);
                scarface.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(scarface);
                break;
            case 10:
                Intent heatles = new Intent(this, QTheHeatles.class);
                heatles.putIntegerArrayListExtra("ARRAY", activityList);
                startActivity(heatles);
                break;
            default:
                Intent scoringpage = new Intent(this, ScoringPage.class);
                startActivity(scoringpage);
        }

    }
}
