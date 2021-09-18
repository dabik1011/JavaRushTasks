package com.javarush.task.task15.task1519;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = reader.readLine()).equals("exit")) {


            try {
                if (line.contains(".")) {
                    print(Double.parseDouble(line));
                } else {
                    int i = Integer.parseInt(line);
                    if (i > 0 && i < 128) {
                        print((short)i);
                    } else {
                        print(i);
                    }
                }
            } catch (Exception e) {
                print(line);
            }
        }
        reader.close();
    }
    

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
