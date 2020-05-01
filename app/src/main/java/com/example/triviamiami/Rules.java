package com.example.triviamiami;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;

public class Rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
    }

    public void firstQuestion(View view) {
        ArrayList<Integer> activityList = new ArrayList<Integer>();

        for(int i = 0; i < 11; i++){
            activityList.add(i);
        }

        System.out.println("activityList size = " + activityList.size());
        Intent intent = new Intent();
        intent.putExtra("activityArray", activityList);

        Random random = new Random();
        int firstQuestion = random.nextInt(11);

        int x = 0;
        //Used a switch statement because I wasn't able to pass a string as the second parameter
        //when creating a new Intent object.
        switch (x){ //firstQuestion){
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

}
