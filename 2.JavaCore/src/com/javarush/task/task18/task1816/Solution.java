package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        try (FileInputStream fileInputStream = new FileInputStream(args[0])) {
            while(fileInputStream.available() > 0) {
                char fileRead = (char) fileInputStream.read();
                if(fileRead >= 'a' && fileRead <= 'z') count++;
                else if(fileRead >= 'A' && fileRead <= 'Z') count++;
            }
        }
        System.out.println(count);
    }
}
