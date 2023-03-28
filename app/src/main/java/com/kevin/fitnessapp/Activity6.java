package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Activity6 extends AppCompatActivity {

    TextView btnlog6;
    RelativeLayout connectdevice, quads;
    ImageView workout, setting;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        btnlog6 = findViewById(R.id.btnlog6);
        connectdevice = findViewById(R.id.connectdevice);
        workout = findViewById(R.id.workout);
        setting = findViewById(R.id.setting);
        quads = findViewById(R.id.quads);

        btnlog6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity6.this, Activity7.class);
                startActivity(in);
            }
        });
        connectdevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity6.this, Activity7.class);
                startActivity(in);
            }
        });
        workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity6.this, Activity11.class);
                startActivity(in);
            }
        });
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity6.this, Activity15.class);
                startActivity(in);
            }
        });
        quads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity6.this, Activity12.class);
                startActivity(in);
            }
        });
    }
}