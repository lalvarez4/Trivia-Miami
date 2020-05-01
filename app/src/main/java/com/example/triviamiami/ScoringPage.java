package com.example.triviamiami;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import java.util.ArrayList;

public class ScoringPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring_page);
    }

    public void storeHighScore(){
        try{
            ArrayList<Integer> activityList = (ArrayList<Integer>)getIntent().getSerializableExtra("activityArray");
            SharedPreferences sharedprefs = getPreferences(MODE_PRIVATE);
        }catch(NullPointerException e){
            Intent intent = new Intent(this, TriviaMiami.class);
            startActivity(intent);
        }
    }
}
