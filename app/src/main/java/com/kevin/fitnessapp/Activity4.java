package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    TextView btnlog4;
    ImageView btnback2;
    @SuppressLint({"MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        btnback2 = findViewById(R.id.btnback2);
        btnlog4 = findViewById(R.id.btnlog4);

        btnback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity4.this, Activity3.class);
                startActivity(in);
            }
        });
        btnlog4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity4.this, Activity5.class);
                startActivity(in);
            }
        });
    }
}