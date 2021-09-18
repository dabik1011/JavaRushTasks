package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();
        long startTime = System.currentTimeMillis();
        System.out.println(factorial(input));
        long time = System.currentTimeMillis() - startTime;
        System.out.println(time/1000 + "sek");

    }

    public static String factorial(int n) {
        //add your code here
        if (n < 0) return "0";
        if (n == 0) return "1";
            BigInteger bd = new BigInteger("1");
            for (int i = 1; i <= n; i++) {
             bd = bd.multiply(new BigInteger(String.valueOf(i)));
            }
            return bd.toString();





        }


      // return String.valueOf(0);
    }

