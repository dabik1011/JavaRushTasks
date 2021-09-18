package com.javarush.task.task13.task1326;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      //  FileInputStream is = new FileInputStream(reader.readLine());
        Scanner fileScaner = new Scanner(new FileReader(reader.readLine()));
       // InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
        List<Integer> array = new ArrayList<>();
       // int i;
        while(fileScaner.hasNextInt()) {
           // System.out.print((char)i);
            int number = fileScaner.nextInt();
            array.add(number);
            //System.out.println(number);

        }
        fileScaner.close();

        List<Integer> list2 = new ArrayList<>();
        for(Integer i: array) {
            if (i % 2 == 0) list2.add(i);
        }
        Collections.sort(list2);
        for (Integer i: list2) System.out.println(i);


        // напишите тут ваш код
    }
}
