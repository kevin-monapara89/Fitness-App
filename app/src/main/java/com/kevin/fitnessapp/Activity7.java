package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity7 extends AppCompatActivity {

    TextView btnconnect;
    ImageView btnback7;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        btnback7 = findViewById(R.id.btnback7);
        btnconnect = findViewById(R.id.btnconnect);

        btnconnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity7.this, Activity8.class);
                startActivity(in);
            }
        });

        btnback7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity7.this, Activity6.class);
                startActivity(in);
            }
        });
    }
}