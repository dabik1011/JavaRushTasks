package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses;
    public static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public Horse getWinner() {
        double dist = 0;
        for(Horse h : horses) {
            if (h.getDistance() > dist) dist = h.getDistance();
        }
        for (Horse h : horses) {
            if(h.getDistance() == dist) return h;
        }
        return null;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move() {
        for (Horse h : horses) {
            h.move();
        }
    }

    void print() {
        for (Horse h : horses) {
            h.print();
        }
        for (int i = 0; i < 10; i++) System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses1 = new ArrayList<>();
        horses1.add(new Horse("Леня" , 3.0, 0.0));
        horses1.add(new Horse("Валя", 3.0, 0.0));
        horses1.add(new Horse("Лена", 3.0, 0.0));

        Hippodrome hippodrome = new Hippodrome(horses1);
        game = hippodrome;

        game.run();
        game.printWinner();
    }
}
