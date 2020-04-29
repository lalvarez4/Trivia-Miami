package com.example.triviamiami;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
    }

    public void QRickyWilliams(View view) {
        Intent intent = new Intent(this, QRickyWilliams.class);
        startActivity(intent);
    }


//    public void fullscreen(View view){
//        Intent intent = new Intent(this, .class);
//        startActivity(intent);
//    }

}
