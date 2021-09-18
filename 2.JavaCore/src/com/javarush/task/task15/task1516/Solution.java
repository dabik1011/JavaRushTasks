package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {

        int intVar;
        double doubleVar;
        Double DoubleVar;
        boolean booleanVar;
        Object ObjectVar;
        Exception ExceptionVar;
        String StringVar;

    public static void main(String[] args) {
        Solution i = new Solution();
        System.out.println(i.intVar);
        System.out.println(i.doubleVar);;
        System.out.println(i.DoubleVar);
        System.out.println(i.booleanVar);
        System.out.println(i.ObjectVar);;
        System.out.println(i.ExceptionVar);
        System.out.println(i.StringVar);
    }
}
