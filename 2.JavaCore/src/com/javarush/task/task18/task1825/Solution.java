package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> fileFullName = new TreeSet<>();
        String read;
        String wayFile = null;
        while (!(read = reader.readLine()).equals("end")) {

//            String index = read.split(".part")[1];
            fileFullName.add(read);
        }

        for (String fileName : fileFullName) {
            try(FileInputStream fis = new FileInputStream(fileName);
            FileOutputStream fos = new FileOutputStream(wayFile)) {
               byte[] buffer = new byte[fis.available()];
               fis.read(buffer);
               fos.write(buffer);
            }
        }
    }
}
