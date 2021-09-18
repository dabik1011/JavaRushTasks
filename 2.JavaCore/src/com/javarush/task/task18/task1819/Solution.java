package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        try (FileInputStream inputStream1 = new FileInputStream(fileName1);
             FileInputStream inputStream2 = new FileInputStream(fileName2)) {
            while (inputStream1.available() > 0) {
                list1.add(inputStream1.read());
            }
            while (inputStream2.available() > 0) {
                list2.add(inputStream2.read());
            }
        }


        try (FileOutputStream outputStream = new FileOutputStream(fileName1)) {
            for(Integer l2: list2) {
                outputStream.write(l2);
            }
            for (Integer l1: list1) {
                outputStream.write(l1);
            }
        }


    }
}
