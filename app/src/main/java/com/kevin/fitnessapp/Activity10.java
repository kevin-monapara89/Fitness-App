package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity10 extends AppCompatActivity {

    TextView history3, badges3;
    ImageView workout;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        history3 = findViewById(R.id.history3);
        badges3 = findViewById(R.id.badges3);
        workout = findViewById(R.id.workout);
        workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity10.this, Activity11.class);
                startActivity(in);
            }
        });
        history3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity10.this, Activity9.class);
                startActivity(intent);
            }
        });
        badges3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity10.this, Activity8.class);
                startActivity(intent);
            }
        });
    }
}