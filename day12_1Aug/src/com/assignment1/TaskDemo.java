package com.assignment1;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by pradhanb on 8/1/2017.
 */
public class TaskDemo {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> taskQueue = new LinkedBlockingQueue<>(); //it's safe

        Producer producer = new Producer(taskQueue);
        Consumer consumer = new Consumer(taskQueue);
        new Thread(producer).start();
        new Thread(consumer).start();

    }
}
