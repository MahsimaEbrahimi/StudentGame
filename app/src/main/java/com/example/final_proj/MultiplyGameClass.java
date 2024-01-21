package com.example.final_proj;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultiplyGameClass {
   Integer FirstNumber;
   Integer SecondNumber;
   Integer Result;



    List list = new ArrayList();
    Random random= new Random();

    public  List  Multiply()
    {
        list.clear();
        FirstNumber=random.nextInt(11);
        SecondNumber =random.nextInt(11);
        Result=FirstNumber* SecondNumber;
        list.add(FirstNumber);
        list.add(SecondNumber);
        list.add(Result);
        return list;

    }
}
