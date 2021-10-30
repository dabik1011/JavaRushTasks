package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Map<String, Double> map = new TreeMap<>();
        String fileName = args[0];
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            double currentValue;
            String[] splitLine;

            while (reader.ready()) {

                splitLine = reader.readLine().split(" ");
                String name = splitLine[0];
                double value = Double.parseDouble(splitLine[1]);
                map.merge(name, value, (oldVal, newVal) -> oldVal + newVal);
            }
        }
        map.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
