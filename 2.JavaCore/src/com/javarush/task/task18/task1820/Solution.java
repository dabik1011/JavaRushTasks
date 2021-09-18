package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.Arrays;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
            String[] numbers = (reader1.readLine()).split(" ");
            for(String number : numbers) {
                double num = Double.parseDouble(number);
                double res = Math.round(num);
                int r = (int) res;
                String result = String.valueOf(r);
                //System.out.println(result);
                writer.write(result + " ");

            }
        }


    }


}
