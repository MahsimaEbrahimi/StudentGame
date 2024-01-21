package com.example.final_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class secoundPage extends AppCompatActivity {
    TextView lblIranGame;

    TextView lblMultiplyGame;

    TextView Welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound_page2);

        lblIranGame=findViewById(R.id.lblIranGame);
        lblMultiplyGame=findViewById(R.id.lblMultipleGame);

        Welcome=findViewById(R.id.Welcome_lbl);


        lblIranGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secoundPage.this,IranGame.class);
                startActivity(intent);
            }
        });

        lblMultiplyGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secoundPage.this,MultiplyGame.class);
                startActivity(intent);
            }
        });

        Intent intent=getIntent();
        String Recive=intent.getStringExtra("name");
        Welcome.setText(  "کاربر "+ Recive+" خوش آمدید:)");



    }
}