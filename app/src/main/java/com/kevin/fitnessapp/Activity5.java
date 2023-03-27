package com.kevin.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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

        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.customdialog);

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
                dialog.show();
                Intent in = new Intent(Activity5.this, Activity6.class);
                startActivity(in);
            }
        });

    }
}