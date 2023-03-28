package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity15 extends AppCompatActivity {

    ImageView home, workout, btnback15;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_15);
        home = findViewById(R.id.home);
        workout = findViewById(R.id.workout);
        btnback15 = findViewById(R.id.btnback15);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity15.this, Activity10.class);
                startActivity(in);
            }
        });
        workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity15.this, Activity11.class);
                startActivity(in);
            }
        });
        btnback15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity15.this, Activity14.class);
                startActivity(in);
            }
        });

    }
}