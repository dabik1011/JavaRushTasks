package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        String file = args[0];
        //String file = "C:\\Users\\Серёжа\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1919\\1";
        Map<String, Double> map = new TreeMap<>();
        String name;
        Double value;
        String[] line;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                line = reader.readLine().split(" ");
                name = line[0];
                value = Double.parseDouble(line[1]);
                map.merge(name, value, (oldValue, newValue) -> oldValue + newValue);
            }
        }
       // map.forEach((key, val) -> System.out.println(key + " " + val));
        Double maxValue = 0.0;

        for (Double val : map.values()) {
            if (val > maxValue) maxValue = val;
        }
       // System.out.println(maxValue);
        for (Map.Entry<String, Double> res : map.entrySet()) {
            if(res.getValue().equals(maxValue)) System.out.println(res.getKey());
        }


    }
}
