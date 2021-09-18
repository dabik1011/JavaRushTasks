package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
     //   if (!(args[0].equals("-e") || args[0].equals("-d"))) return;
        try (FileOutputStream fileOutputStream = new FileOutputStream(args[2]);
             FileInputStream fileInputStream = new FileInputStream(args[1])) {
            if (args[0].equals("-e")) {
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read() + 1);
                }
            } else {
                while (fileInputStream.available() > 0) {

                    fileOutputStream.write(fileInputStream.read() - 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
