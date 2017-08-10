package com.multithreading.assignment2;

/**
 * Created by pradhanb on 7/31/2017.
 */
public class TaskDemoLambda{
        static int i =0;
    public static void main(String[] args) {

        for (int j = 0; j <20 ; j++) {
        Thread thread1=new Thread(()-> {
            i++;
        });
        Thread thread2 = new Thread(()->{
            System.out.println("I : " + i);
        });
        thread1.start();
        thread2.start();
    }
    }
}
