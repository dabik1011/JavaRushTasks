package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream outputStream = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        List<Integer> list = new ArrayList<>();
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            list.add(data);
        }
        Collections.reverse(list);
        for (Integer ints : list) {
            outputStream.write(ints);
        }
        inputStream.close();
        outputStream.close();


    }
}
