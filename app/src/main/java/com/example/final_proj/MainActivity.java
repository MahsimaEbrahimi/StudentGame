package com.example.final_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Name_txt;
    TextView Email_txt;
    Button btn_login;
    String SentInf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name_txt=(EditText) findViewById(R.id.name_txt);
        btn_login=(Button) findViewById(R.id.btn_login);
        Email_txt= (TextView) findViewById(R.id.name_txt);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SentInf=Name_txt.getText().toString();
                Intent intent=new Intent(MainActivity.this, secoundPage.class);
                intent.putExtra("name",SentInf);
                startActivity(intent);
            }
        });

    }
}