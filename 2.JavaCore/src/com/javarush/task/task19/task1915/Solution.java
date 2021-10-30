package com.javarush.task.task19.task1915;

import java.io.*;
import java.nio.charset.StandardCharsets;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        ByteArrayOutputStream byteAr = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteAr);
        System.setOut(ps);

        testString.printSomething();

        String result = byteAr.toString();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try(FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine())){
            fileOutputStream.write(byteAr.toByteArray());
        }
        System.setOut(out);
        System.out.println(result);
        reader.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

