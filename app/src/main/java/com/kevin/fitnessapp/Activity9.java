package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity9 extends AppCompatActivity {

    TextView badges2, stats2;
    ImageView workout, setting, setting1, btnback9;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);

        badges2 = findViewById(R.id.badges2);
        stats2 = findViewById(R.id.stats2);
        workout = findViewById(R.id.workout);
        setting = findViewById(R.id.setting);
        setting1 = findViewById(R.id.setting1);
        btnback9 = findViewById(R.id.btnback9);

        badges2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity9.this, Activity8.class);
                startActivity(intent);
            }
        });
        stats2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity9.this, Activity10.class);
                startActivity(intent);
            }
        });
        workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity9.this, Activity11.class);
                startActivity(in);
            }
        });
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity9.this, Activity15.class);
                startActivity(in);
            }
        });
        setting1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity9.this, Activity15.class);
                startActivity(in);
            }
        });
        btnback9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity9.this, Activity8.class);
                startActivity(in);
            }
        });

    }
}