package com.javarush.task.task22.task2212;

/*
Проверка номера телефона
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null) return false;
        /*return (telNumber.matches("^\\+\\d{12}$") ||
                telNumber.matches("^(\\+\\d{2})(\\(\\d{3}\\))(\\d{7})$") ||
                telNumber.matches("^(\\d)(\\(\\d{3}\\))(\\d{6})$") ||
                telNumber.matches("^(\\(\\d{3}\\))\\d{7}$"));*/
        return (telNumber.matches("^\\+(\\d[()]?){12}$") || telNumber.matches("^([()]?\\d){10}$"))
                && telNumber.matches("^(\\+)?(\\d+)?(\\(\\d{3}\\))?\\d+$");
    }

    public static void main(String[] args) {
    }
}
