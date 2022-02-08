package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char [] strA = str.toCharArray();
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for (Character s: strA) {
            if (isVowel(s)) list1.add(s);
            else if (!isVowel(s) &&  s != ' ')list2.add(s);
        }
        for (Character l: list1 ) {
            System.out.print(l + " ");
        }
        System.out.println();
        for (Character l: list2) {
            System.out.print(l + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}