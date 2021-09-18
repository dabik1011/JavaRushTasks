package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> [] list = new ArrayList[2];
        list[0] = new ArrayList<String>(Arrays.asList("dqwd", "asd"));
        list[1] = new ArrayList<String>(Arrays.asList("dwdw","asdd"));



        //напишите тут ваш код

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}