package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public void close() {
            fileScanner.close();
        }

        @Override
        public Person read() throws IOException {
            
            String line = fileScanner.nextLine();
            String[] words = line.split("\\s");
            String firstName = words[0];
            String secondName = words[1];
            String lastName = words[2];
            String dateStr = String.format("%s %s %s", words[3], words[4], words[5]);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            Date birthDate = null;
            try {
                birthDate = dateFormat.parse(dateStr);
            } catch (ParseException e) {
                e.printStackTrace();
            }


            return new Person(secondName,lastName,firstName, birthDate);
        }
    }
}
