package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        try {
            while(true) {
                int x = Integer.parseInt(reader.readLine());
                list.add(x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            for(Integer l: list) System.out.println(l);
        }
        //напишите тут ваш код
    }
}
