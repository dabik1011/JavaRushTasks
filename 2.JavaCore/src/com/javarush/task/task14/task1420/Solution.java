package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println(gcd(a, b));
    }

    public static int gcd(int max, int min) {
        if (max < 1 || min < 1) {
            throw new IllegalArgumentException();
        }

        while (max > 0) {
            if (max < min) {
                int x = max;
                max = min;
                min = x;
            }
            max %= min;
        }

        return min;
    }
}

