package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int min = 0;
        try {
            min = 255;
            while (inputStream.available() > 0) {
                int current = inputStream.read();
                if (current < min) min = current;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        inputStream.close();

        System.out.println(min);
    }
}