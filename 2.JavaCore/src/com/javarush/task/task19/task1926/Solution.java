package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader readerFileName = new BufferedReader(new InputStreamReader(System.in));
        String fileName = readerFileName.readLine();
        readerFileName.close();

        try (BufferedReader readerFile = new BufferedReader(new FileReader(fileName))) {
            while (readerFile.ready()) {
                String stringFile = readerFile.readLine();
                StringBuffer buffer = new StringBuffer(stringFile);
                buffer.reverse();
                System.out.println(buffer);
            }
        }
    }
}
