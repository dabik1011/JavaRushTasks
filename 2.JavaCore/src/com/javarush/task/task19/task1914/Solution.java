package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Pattern;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        System.setOut(ps);
        testString.printSomething();
        System.setOut(out);

        String byteArray = byteArrayOutputStream.toString();
        String[] str = byteArray.split(" ");
        int first = Integer.parseInt(str[0]);
        int second = Integer.parseInt(str[2]);
        int result;

        if(str[1].equals("+")){
            result = first + second;
        }
        else if (str[1].equals("-")){
            result = first - second;
        }
        else result = first * second;

        System.out.println(first + " " + str[1] + " " + second + " " + "=" + " " + result);




    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

