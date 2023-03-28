package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity12 extends AppCompatActivity {

    TextView startworkout;
    ImageView btnback12;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_12);
        startworkout = findViewById(R.id.startwork);
        btnback12 = findViewById(R.id.btnback12);
        startworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity12.this, Activity13.class);
                startActivity(in);
            }
        });
        btnback12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity12.this, Activity11.class);
                startActivity(in);
            }
        });

    }
}