package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("Cat", new Cat("qwer"));
        map.put("Cat2", new Cat("qwert"));
        map.put("Cat3", new Cat("qw"));
        map.put("Cat4", new Cat("erfs"));
        map.put("Cat5", new Cat("bfdbf"));
        map.put("Cat6", new Cat("vbdd"));
        map.put("Cat7", new Cat("fg[dg"));
        map.put("Cat8", new Cat("fgdg"));
        map.put("Cat9", new Cat("fgkkdg"));
        map.put("Cat10", new Cat("fgdsadg"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cat = new HashSet<Cat>(map.values());
        return cat;
        }


        //напишите тут ваш код


    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
