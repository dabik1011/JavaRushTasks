package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws Exception {
        //start here - начни тут
        if (args == null || args.length < 1)
            throw new RuntimeException();

        Person person;
        Date birthDate = new Date();

        switch(args [0]) {
            case "-c":
                birthDate = simpleDateFormat.parse(args[3]);
                           
                if(args[2].equals("м"))
                    person = Person.createMale(args[1], birthDate);
                else 
                    person = Person.createFemale(args[1], birthDate);
                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
                break;
            case "-u":
                birthDate = simpleDateFormat.parse(args[4]);
                int id = Integer.parseInt(args[1]);
                person = allPeople.get(id);
                if (person == null) 
                    throw new IllegalArgumentException();
                person.setSex(getSex(args[3]));
                person.setBirthDate(birthDate);
                person.setName(args[2]);
                break;
            case "-d":
                Person currentPerson = allPeople.get(Integer.valueOf(args[1]));
                currentPerson.setName(null);
                currentPerson.setSex(null);
                currentPerson.setBirthDate(null);
                break;
            case "-i":
                person = allPeople.get(Integer.parseInt(args[1]));
                if (person != null)
                    System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + simpleDateFormat2.format(person.getBirthDate()));
                break;
                  }
                  
    }
    private static Sex getSex (String sexParam) {
        return sexParam.equals("м") ? Sex.MALE:Sex.FEMALE;
    }
}