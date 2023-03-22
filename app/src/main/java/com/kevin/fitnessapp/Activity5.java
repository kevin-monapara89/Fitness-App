package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {

    TextView btnlog5;
    ImageView btnback3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        btnback3 = findViewById(R.id.btnback3);
        btnlog5 = findViewById(R.id.btnlog5);
        
        btnback3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity5.this, Activity4.class);
                startActivity(in);
            }
        });
        btnlog5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity5.this, Activity8.class);
                startActivity(in);
            }
        });
    }
}