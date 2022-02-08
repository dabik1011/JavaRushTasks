package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        if(string == null) throw new TooShortStringException();
        String[] str = string.split(" ");
        if(str.length < 5) throw new TooShortStringException();
        String result = String.format("%s %s %s %s", str[1], str[2], str[3], str[4]);
        return result;
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
