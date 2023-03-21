package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Activity6 extends AppCompatActivity {
    RelativeLayout connectdevice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        connectdevice = findViewById(R.id.connectdevice);

        connectdevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity6.this, Activity7.class);
                startActivity(in);
            }
        });
    }
}