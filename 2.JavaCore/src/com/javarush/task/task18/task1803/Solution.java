package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
            long[] byteArray = new long[256];

            while (inputStream.available() > 0) byteArray[inputStream.read()]++;
            long maxByte = 0;

            for (int i = 0; i < byteArray.length; i++) {
                if (byteArray[i] > maxByte) maxByte = byteArray[i];
            }

            for (int i = 0; i < byteArray.length; i++) {
                if (byteArray[i] == maxByte) System.out.print(i + " ");
            }
        } catch (IOException e) {
            System.out.println("piy-piy");
        }

        inputStream.close();
    }
}
