package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = s.substring(s.indexOf("?") + 1);
        String [] words = s1.split("&");
        StringBuilder builder = new StringBuilder();
       // List<String> list = new ArrayList<>();
        String finish = null;
// obj 3.14 name Amigo
        for(String obj: words) {
            String [] words2 = obj.split("=");
            builder.append(words2[0]).append(" ");

            if (words2[0].equals("obj")) {
                finish = words2[1];
            }
        }

        System.out.println(builder.toString().trim());

        try {
            if (finish != null) {
                alert(Double.parseDouble(finish));
            }
        } catch (Exception e) {
            alert(finish);
        }




    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
