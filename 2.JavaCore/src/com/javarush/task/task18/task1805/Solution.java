package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        Set<Integer> set = new TreeSet<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            set.add(data);
        }
        inputStream.close();

        for(Integer i : set) {
            System.out.print(i + " ");
        }

    }
}
