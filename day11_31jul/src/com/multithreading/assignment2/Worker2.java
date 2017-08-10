package com.multithreading.assignment2;

/**
 * Created by pradhanb on 7/31/2017.
 */
class Worker2 extends Thread {
    PrintTask printTask = null;

    public Worker2(PrintTask printTask) {
        this.printTask = printTask;
    }

    @Override
    public void run() {
        printTask.run();
    }
}

