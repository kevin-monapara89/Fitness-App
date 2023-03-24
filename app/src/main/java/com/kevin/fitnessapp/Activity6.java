package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Activity6 extends AppCompatActivity {

    TextView btnlog6;
    RelativeLayout connectdevice;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        btnlog6 = findViewById(R.id.btnlog6);
        connectdevice = findViewById(R.id.connectdevice);
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
    }
}