package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Activity8 extends AppCompatActivity {

    TextView history, stats;
    ImageView workout8, setting8, setting18, btnback8;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        history = findViewById(R.id.history);
        stats = findViewById(R.id.stats);
        workout8 = findViewById(R.id.workout8);
        setting8 = findViewById(R.id.setting8);
        setting18 = findViewById(R.id.setting18);
        btnback8 = findViewById(R.id.btnback8);

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity8.this, Activity9.class);
                startActivity(intent);
            }
        });
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity8.this, Activity10.class);
                startActivity(intent);
            }
        });
        workout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity8.this, Activity11.class);
                startActivity(intent);
            }
        });
        setting8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity8.this, Activity10.class);
                startActivity(intent);
            }
        });
        setting18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity8.this, Activity10.class);
                startActivity(intent);
            }
        });
        btnback8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity8.this, Activity7.class);
                startActivity(intent);
            }
        });
    }
}