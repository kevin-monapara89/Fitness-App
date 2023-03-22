package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    ImageView btnback1;
    TextView btnlog3;

    @SuppressLint({"MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        btnback1 = findViewById(R.id.btnback1);
        btnlog3 = findViewById(R.id.btnlog3);

        btnback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity3.this, Activity2.class);
                startActivity(in);
            }
        });
        btnlog3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity3.this, Activity4.class);
                startActivity(in);
            }
        });
    }
}