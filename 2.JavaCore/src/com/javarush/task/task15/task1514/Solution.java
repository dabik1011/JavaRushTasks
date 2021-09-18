package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(2.5,"Zlp");
        labels.put(3.1,"Jpd");
        labels.put(4.5,"rew");
        labels.put(1.6,"ewr");
        labels.put(342.2, "WQer");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
