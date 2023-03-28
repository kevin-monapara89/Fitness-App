package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity14 extends AppCompatActivity {

    TextView dashboard;
    ImageView btnback14;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_14);
        dashboard = findViewById(R.id.dashboard);
        btnback14 = findViewById(R.id.btnback14);

        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity14.this, Activity9.class);
                startActivity(in);
            }
        });
        btnback14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity14.this, Activity13.class);
                startActivity(in);
            }
        });

    }
}