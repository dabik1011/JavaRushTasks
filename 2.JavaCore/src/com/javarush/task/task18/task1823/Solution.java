package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = reader.readLine()).equals("exit")) {
            new ReadThread(line).start();
        }


    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;

        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {


            int max = 0;
            int maxI = 0;
            int[] buffer = new int[256];
            try (FileInputStream inputStream = new FileInputStream(fileName)) {
                while (inputStream.available() > 0) {
                    buffer[inputStream.read()]++;
                }
                for (int i = 0; i < buffer.length; i++) {
                    if (max < buffer[i]) {
                        max = buffer[i];
                        maxI = i;
                    }
                    resultMap.put(fileName, maxI);
                }
            } catch (FileNotFoundException exception) {
                exception.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

