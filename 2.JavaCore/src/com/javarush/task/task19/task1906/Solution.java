package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        try (FileReader reader1 = new FileReader(fileName1); FileWriter writer = new FileWriter(fileName2)) {
            while (reader1.ready()) {
                reader1.read();
                writer.write(reader1.read());
            }
        }
    }
}
