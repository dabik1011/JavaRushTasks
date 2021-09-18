package com.javarush.task.task18.test;

import java.io.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        byte[] buffer = null;
        try (FileInputStream inputStream = new FileInputStream(file1);
             FileOutputStream outputStream = new FileOutputStream(file2)) {
            if(inputStream.available() > 0) {
                buffer = new byte[inputStream.available()];
            }
            System.out.println(Arrays.toString(buffer));
        }
    }
}
