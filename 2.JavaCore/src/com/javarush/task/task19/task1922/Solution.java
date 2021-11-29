package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        try (BufferedReader readerFile = new BufferedReader(new FileReader(fileName))) {
            while (readerFile.ready()) {
                String string = readerFile.readLine();
                String[] line = string.split(" ");
                int count = 0;

                for(String s : line) {
                        if(words.contains(s)) {
                            count++;
                        }
                }
                if (count == 2) System.out.println(string);
                count = 0;
            }

        }
    }
}