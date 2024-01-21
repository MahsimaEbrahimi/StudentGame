package com.example.final_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WinscreenIran extends AppCompatActivity {
Button Reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winscreen_iran);
        Reset= findViewById(R.id.Reset);
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WinscreenIran.this,IranGame.class);
                startActivity(intent);
            }
        });

    }
}