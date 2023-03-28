package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity13 extends AppCompatActivity {

    TextView nextexcercise;
    ImageView btnback13;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13);
        nextexcercise = findViewById(R.id.nextexcercise);
        btnback13 = findViewById(R.id.btnback13);
        nextexcercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity13.this, Activity14.class);
                startActivity(in);
            }
        });
        btnback13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity13.this, Activity12.class);
                startActivity(in);
            }
        });

    }
}