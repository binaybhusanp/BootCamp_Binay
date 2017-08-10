package com.assignment2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by pradhanb on 8/2/2017.
 */
public class PrimeNumberAdderTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        Future<Integer> future1 = executor.submit(() -> {
            return PrimeNumberAdder.primeAdder(1, 100);
        });

        Future<Integer> future2 = executor.submit(() -> {
            return PrimeNumberAdder.primeAdder(101, 200);
        });

        Future<Integer> future3 = executor.submit(() -> {
            return PrimeNumberAdder.primeAdder(201, 300);
        });

        Future<Integer> future4 = executor.submit(() -> {
            return PrimeNumberAdder.primeAdder(301, 400);
        });

        Future<Integer> future5 = executor.submit(() -> {
            return PrimeNumberAdder.primeAdder(401, 500);
        });

        try {
            System.out.println(future1.get() + future2.get() + future3.get() + future4.get() + future5.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}

