package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity7 extends AppCompatActivity {

    TextView btnlog4;
    ImageView btnback6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        btnback6 = findViewById(R.id.btnback6);
        btnlog4 = findViewById(R.id.btnlog5);

        btnlog4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity7.this, Activity8.class);
                startActivity(in);
            }
        });

        btnback6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity7.this, Activity6.class);
                startActivity(in);
            }
        });
    }
}