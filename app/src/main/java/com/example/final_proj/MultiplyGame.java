package com.example.final_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MultiplyGame extends AppCompatActivity {

    Integer Counter=10;

    Integer score=0;

    TextView firstNumber;
    TextView secoundNumber;

    EditText ResultMultiply;

    String resGet;

    String Result_func;

    Button Submit;

    List lstRes;

    TextView CounterShow;

    TextView scoreShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiply_game);

        firstNumber=findViewById(R.id.FirstTxt);
        secoundNumber=findViewById(R.id.SecondTxt);
        Submit=findViewById(R.id.Submit);
        ResultMultiply=findViewById(R.id.ResultMultiply);
        CounterShow=findViewById(R.id.counter);
        scoreShow=findViewById(R.id.scoreShow2);

        MultiplyGameClass multiplyGameClass = new MultiplyGameClass();
        lstRes=multiplyGameClass.Multiply();

        firstNumber.setText(lstRes.get(0).toString());
        secoundNumber.setText(lstRes.get(1).toString());
        Result_func=lstRes.get(2).toString();




        CounterShow.setText("شانس ها:  "+Counter.toString());
        scoreShow.setText("امتیاز ها:  "+score.toString());


        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resGet=ResultMultiply.getText().toString().strip();


                if (Result_func.equals(resGet))
                {
                    lstRes=multiplyGameClass.Multiply();
                    firstNumber.setText(lstRes.get(0).toString());
                    secoundNumber.setText(lstRes.get(1).toString());
                    Result_func=lstRes.get(2).toString();

                    ResultMultiply.getText().clear();
                    score+=1;
                    Counter-=1;

                    CounterShow.setText("شانس ها:  "+Counter.toString());
                    scoreShow.setText("امتیاز ها:  "+score.toString());
                }
                else
                {
                    Counter-=1;
                    CounterShow.setText("شانس ها:  "+Counter.toString());
                    Toast.makeText(MultiplyGame.this, "شما ضرب را اشتباه وارد کردید", Toast.LENGTH_SHORT).show();

                }
                if (score>=5)
                {
                    Intent intent = new Intent(MultiplyGame.this,WinscreenMultiply.class);
                    startActivity(intent);
                }
                else
                {
                    if (Counter==0)
                    {
                        if (score!=5)
                        {
                            Intent intent = new Intent(MultiplyGame.this,LooseScreenMultiply.class);
                            startActivity(intent);
                        }
                    }
                }


            }
        });




    }
}