package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName1;
        String fileName2;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
        }
        List<String> list1 = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1))) {
            while (bufferedReader.ready()) {
                for (String s : bufferedReader.readLine().split("\\s")) {
                    list1.add(s);
                }
            }

        }
        List<Integer> list2 = new ArrayList<>();

           try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
               for (String s : list1) {
                   try {
                       list2.add(Integer.parseInt(s));
                       writer.write(s + " ");
                   } catch (NumberFormatException e) {
                       continue;
                   }
               }
           }



//        for(Integer i : list2) {
//            System.out.println(i);
//        }
//        Pattern pattern1 = Pattern.compile("^[a-e]");
//
//        Matcher matcher1 = pattern1.matcher("a b c d");
//        System.out.println(matcher1.find());


    }
}
