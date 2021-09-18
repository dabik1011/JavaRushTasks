package com.javarush.task.task16.task1632;

public class Thread4 extends Thread implements Message {
    boolean t = true;
    @Override
    public void run() {
        while (!isInterrupted()){}

    }

    @Override
    public void showWarning() {
        this.interrupt();
    }
}
