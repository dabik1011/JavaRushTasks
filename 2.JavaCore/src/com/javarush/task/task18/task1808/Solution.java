package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName1);

        FileOutputStream outputStream2 = new FileOutputStream(fileName2);
        FileOutputStream outputStream3 = new FileOutputStream(fileName3);

        if (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            if (count % 2 == 0) {
                outputStream2.write(buffer, 0, count / 2);
                outputStream3.write(buffer, count / 2, count / 2);
            } else {
                outputStream2.write(buffer, 0, count / 2 + 1);
                outputStream3.write(buffer, count / 2 + 1, count / 2);
            }
        }

        inputStream.close();
        outputStream2.close();
        outputStream3.close();

    }
}
