package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Только по-очереди!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        t1.printResult();
        t2.printResult();
    }
    public static class Read3Strings extends Thread {
        public String reader1;
        public String reader2;
        public String reader3;
        @Override
        public void run() {
            try {
                 reader1 = reader.readLine();
                reader2 = reader.readLine();
                reader3 = reader.readLine();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        public void printResult() {
            System.out.println(reader1 + " " + reader2 + " " + reader3);
        }
    }

    //add your code here - добавьте код тут
}
