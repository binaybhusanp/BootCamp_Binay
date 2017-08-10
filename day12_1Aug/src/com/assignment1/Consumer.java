package com.assignment1;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by pradhanb on 8/1/2017.
 */
public class Consumer implements Runnable {
    LinkedBlockingQueue<Integer> taskQueue = new LinkedBlockingQueue<>();

    public Consumer(LinkedBlockingQueue<Integer> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        while(true) {
            System.out.println(taskQueue.poll());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
