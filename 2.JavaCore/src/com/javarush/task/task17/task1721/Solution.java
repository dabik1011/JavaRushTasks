package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        try {
           BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
            while(reader1.ready()) {
                allLines.add(reader1.readLine());
            }
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
            while (reader2.ready()) {
                forRemoveLines.add(reader2.readLine());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();
        new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
