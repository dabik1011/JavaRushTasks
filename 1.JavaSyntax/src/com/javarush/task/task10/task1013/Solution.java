package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private int weigth;
        private int heigth;
        private String color;
        private int size;

        public Human (){}

         public Human (String name){
           this.name = name;
         }
         public Human (String name, int age) {
            this.name = name;
            this.age = age;
         }

        public Human(int age) {
            this.age = age;
        }

        public Human(String name, int age, int weigth, int heigth, String color, int size) {
            this.name = name;
            this.age = age;
            this.weigth = weigth;
            this.heigth = heigth;
            this.color = color;
            this.size = size;
        }

        public Human(int age, int weigth, int heigth) {
            this.age = age;
            this.weigth = weigth;
            this.heigth = heigth;
        }

        public Human(int heigth, String color, int size) {
            this.heigth = heigth;
            this.color = color;
            this.size = size;
        }

        public Human(int age, int weigth, int heigth, String color, int size) {
            this.age = age;
            this.weigth = weigth;
            this.heigth = heigth;
            this.color = color;
            this.size = size;
        }

        public Human(String name, int heigth, int size) {
            this.name = name;
            this.heigth = heigth;
            this.size = size;
        }

        public Human(String name, int age, int heigth, String color, int size) {
            this.name = name;
            this.age = age;
            this.heigth = heigth;
            this.color = color;
            this.size = size;
        }
        // Напишите тут ваши переменные и конструкторы
    }
}
