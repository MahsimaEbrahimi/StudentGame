package com.example.final_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.Normalizer;
import java.util.List;

public class IranGame extends AppCompatActivity {

    TextView ScoreShow;

    Integer score=0;

    TextView CounterShow;
    Integer Counter=10;
    List CountryNameList;
    Button button;

    String CountryName;
    String City;
    TextView Show_Coutry_name;

    EditText RandomGuess;

    String RandomGuessVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iran_game);
        ScoreShow=findViewById(R.id.scoreShow);
        CounterShow=findViewById(R.id.Counter);
        CounterShow.setText("شانس ها:  "+Counter.toString());
        ScoreShow.setText("امیتاز:  "+score.toString());
        Show_Coutry_name=findViewById(R.id.RandomCountry);
        RandomGuess=findViewById(R.id.RandomGuess);
        button=findViewById(R.id.button);
        IranGameClass IranGame=new IranGameClass();
        IranGame.addMethod();
        CountryNameList=IranGame.Random_name();
        CountryName= (String) CountryNameList.get(0);
        City= (String) CountryNameList.get(1);
        Show_Coutry_name.setText(CountryName.toString());

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                RandomGuessVal=RandomGuess.getText().toString();
                RandomGuessVal=RandomGuessVal.strip().toLowerCase();
                Counter-=1;
                if (City.toLowerCase().equals(RandomGuessVal)) {

                    CountryNameList = IranGame.Random_name();
                    CountryName = (String) CountryNameList.get(0);
                    City = (String) CountryNameList.get(1);
                    Show_Coutry_name.setText(CountryName.toString());
                    RandomGuess.getText().clear();
                    CounterShow.setText("شانس ها:  " + Counter.toString());
                    score += 1;
                    ScoreShow.setText("امیتاز:  " + score.toString());

                }
                else
                {
                    Toast.makeText(IranGame.this, "شما نام استان را اشتباه وارد کردید", Toast.LENGTH_SHORT).show();
                    CounterShow.setText("شانس ها:  "+Counter.toString());

                }

                if (score >= 5) {
                    Intent intent = new Intent(IranGame.this, WinscreenIran.class);
                    startActivity(intent);
                }
                if (Counter == 0) {
                    if (score != 5)
                    {
                        Intent intent = new Intent(IranGame.this, LooseIran.class);
                        startActivity(intent);
                    }
                }
            }
        });

    }
}