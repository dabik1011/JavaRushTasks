package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            int id;
            String name;
            try {

                id = Integer.parseInt(reader.readLine());
                name = reader.readLine();
             //   if (name.equals("")) break;
                map.put(name, id);
            }
            catch (NumberFormatException e) {

                break;
                }


        }

        for (Map.Entry<String, Integer> pair:map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(value + " " + key);
        }
    }
}
