package com.multithreading.assignment2;

/**
 * Created by pradhanb on 7/31/2017.
 */
public class Worker1 extends Thread {
    ValueTask valueTask = null;

    public Worker1(ValueTask valueTask) {
        this.valueTask = valueTask;
    }

    @Override
    public void run() {
        valueTask.run();
    }
}
