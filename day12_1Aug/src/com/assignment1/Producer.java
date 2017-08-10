package com.assignment1;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by pradhanb on 8/1/2017.
 */
public class Producer implements Runnable {
    LinkedBlockingQueue<Integer> taskQueue = new LinkedBlockingQueue<>();

    public Producer(LinkedBlockingQueue<Integer> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        while (true) {
            int val = (int) Math.floor(Math.random() * 1000);
            taskQueue.offer(val);
            System.out.println("Queue Size:" + taskQueue.size());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

