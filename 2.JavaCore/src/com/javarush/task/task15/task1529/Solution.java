package com.javarush.task.task15.task1529;

// import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
       try {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           String s = reader.readLine();
           if (s.equals("helicopter")) result = new Helicopter();
           else if (s.equals("plane")) result = new Plane(9);
       }
       catch (IOException e) {
           e.printStackTrace();
       }
        //add your code here - добавьте код тут
    }
}
