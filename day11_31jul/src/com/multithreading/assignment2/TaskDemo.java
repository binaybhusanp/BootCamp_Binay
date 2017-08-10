package com.multithreading.assignment2;

/**
 * Created by pradhanb on 7/31/2017.
 */
public class TaskDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Worker1 worker1 = new Worker1(new ValueTask());
            Worker2 worker2 = new Worker2(new PrintTask());
            worker1.start();
            worker2.start();
        }
    }

}

