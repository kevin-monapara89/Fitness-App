package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Activity11 extends AppCompatActivity {

    ImageView home, setting, btnback11;
    RelativeLayout quads;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_11);

        home = findViewById(R.id.home);
        setting = findViewById(R.id.setting);
        btnback11 = findViewById(R.id.btnback11);
        quads = findViewById(R.id.quads);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity11.this, Activity10.class);
                startActivity(in);
            }
        });
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity11.this, Activity15.class);
                startActivity(in);
            }
        });
        quads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity11.this, Activity12.class);
                startActivity(in);
            }
        });
        btnback11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity11.this, Activity10.class);
                startActivity(in);
            }
        });
    }
}