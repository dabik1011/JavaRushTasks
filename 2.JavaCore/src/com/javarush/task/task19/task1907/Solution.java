package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        int count = 0;
        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName))){

            while(fileReader.ready()){
                for(String s : fileReader.readLine().split("\\W")){
                    if(s.equals("world")) count++;
                }
            }
        }
        System.out.println(count);
    }
}
