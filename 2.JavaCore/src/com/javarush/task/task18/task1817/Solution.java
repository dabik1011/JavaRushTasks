package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int countAll = 0;
        int count = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                 countAll++;
                if ((fileReader.read()) == ' ') {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        double result = (double) count / countAll * 100;
        System.out.printf("%.2f", result);

    }
}
