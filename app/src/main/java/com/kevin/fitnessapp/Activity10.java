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
    ImageView workout, setting, setting1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        history3 = findViewById(R.id.history3);
        badges3 = findViewById(R.id.badges3);
        workout = findViewById(R.id.workout);
        setting = findViewById(R.id.setting);
        setting1 = findViewById(R.id.setting1);
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
        workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity10.this, Activity11.class);
                startActivity(in);
            }
        });
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity10.this, Activity15.class);
                startActivity(in);
            }
        });
        setting1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity10.this, Activity15.class);
                startActivity(in);
            }
        });

    }
}