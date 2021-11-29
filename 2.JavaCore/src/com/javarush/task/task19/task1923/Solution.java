package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String file1 = args[0];
        String file2 = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
                while(reader.ready()) {
                    String[] str = reader.readLine().split(" ");
                    for(String s : str) {
                        if(s.replaceAll("\\d", "").length() > 0) {
                            writer.write(s + " ");
                        }
                    }
                }
        }
    }
}
