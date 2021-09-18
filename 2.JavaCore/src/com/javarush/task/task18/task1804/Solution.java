package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int[] arrayByte = new int[256];
        while (inputStream.available() > 0) arrayByte[inputStream.read()]++;
        inputStream.close();
        int min = Integer.MAX_VALUE;
        for (Integer bt : arrayByte) {
            if (bt < min && bt > 0) {
                min = bt;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrayByte.length; i++) {
            if (arrayByte[i] == min ) result.add(i);
        }

        for(Integer res : result) {
            System.out.print(res + " ");
        }
        
    }
}
