package com.example.final_proj;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class IranGameClass {
    Map<String, String> dictionary = new HashMap<>();
    List a = new ArrayList();


    public void addMethod()
    {

          dictionary.put("Gilan","rasht");
          dictionary.put("Fars","Shiraz");
        dictionary.put("Yazd","Yazd");
        dictionary.put("Ardebil","Ardebil");
        dictionary.put("Zanjan","Zanjan");
        dictionary.put("Ghazvin","Ghazvin");
        dictionary.put("lorestan","khoram Abad");
        dictionary.put("Markazi","Arak");
        dictionary.put("Qom","Qom");
        dictionary.put("Kerman","Kerman");
       dictionary.put("Tehran","Tehran");
        dictionary.put("Mazandaran","Sari");

    }
public List Random_name()
{
    a.clear();
    Random random= new Random();
    Set<String> keySet = dictionary.keySet();
    List<String> keyList = new ArrayList<>(keySet);

    int size = keyList.size();
    int randIdx = new Random().nextInt(size);

    String randomKey = keyList.get(randIdx);
    String randomValue = dictionary.get(randomKey);
    a.add(randomKey);
    a.add(randomValue);
    return  a;
}



}
