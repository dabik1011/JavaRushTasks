package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String line;
        try (BufferedReader readFile = new BufferedReader(new FileReader(fileName))) {
            while ((line = readFile.readLine()) != null) {
                if (line.startsWith(args[0] + " ")) {
                    System.out.println(line);
                    break;
                }
            }
        }

    }
}
