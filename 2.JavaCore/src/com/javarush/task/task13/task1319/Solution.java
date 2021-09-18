package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
      //  System.out.println("Введите имя файла");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(nameFile));

        String text;
        //int i = 0;
        while (true) {
            text = reader.readLine();
           // System.out.println("Ведите текст, записываемый в файл");
            writer.write(text + "\n");
            if (text.equals("exit")) break;
        }
        writer.close();


    }
}
