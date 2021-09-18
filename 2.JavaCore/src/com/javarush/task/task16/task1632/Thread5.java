package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thread5 extends Thread {
    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            try {
                String str = reader.readLine();
                if (str.equals("N"))
                    break;
                sum += Integer.parseInt(str);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.print(sum);

    }
}
        

