package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {
        //String file = args[0];
        String file = "C:\\Users\\Серёжа\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1921\\1";
        String name;
        String[] array;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                String line = reader.readLine();
                name = line.replaceAll("\\d", "").trim();
               // System.out.println(name);
                array = line.split(" ");
                int year = Integer.parseInt(array[array.length - 1]);
                int month = Integer.parseInt(array[array.length - 2]) -1;
                int day = Integer.parseInt(array[array.length - 3]);
                Calendar birthday = new GregorianCalendar(year, month, day);
                PEOPLE.add(new Person(name, birthday.getTime()));
                System.out.println(name + " " + birthday);
            }
        }


    }
}