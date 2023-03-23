package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity9 extends AppCompatActivity {

    TextView badges2, stats2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);

        badges2 = findViewById(R.id.badges2);
        stats2 = findViewById(R.id.stats2);

        badges2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity9.this, Activity8.class);
                startActivity(intent);
            }
        });
        stats2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity9.this, Activity10.class);
                startActivity(intent);
            }
        });
    }
}