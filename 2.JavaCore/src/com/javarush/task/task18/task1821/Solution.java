package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        int[] buffer = new int[256];
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\Серёжа\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1821\\1")) {
            while (inputStream.available() > 0) {
                buffer[inputStream.read()]++;
            }
            for (int i = 0; i < buffer.length; i++) {
                if (buffer[i] != 0) {
                    System.out.println((char) i + " " + buffer[i]);
        }

            }
        }
    }
}
