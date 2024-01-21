package com.example.final_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LooseIran extends AppCompatActivity {
    Button ResetLoose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loose_iran);
        ResetLoose=findViewById(R.id.ResetLoose);
        ResetLoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LooseIran.this,IranGame.class);
                startActivity(intent);
            }
        });
    }
}