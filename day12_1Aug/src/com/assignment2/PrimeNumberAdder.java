package com.assignment2;

/**
 * Created by pradhanb on 8/2/2017.
 */
public class PrimeNumberAdder {
    public static int primeAdder(int lowerBOund, int upperBound) {
        int sum = 0, flag = 0;
        for (int i = lowerBOund; i > 1 && i <= upperBound; i++) {
            for (int j = 2; j <Math.sqrt((double)i); j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                sum = sum + i;
            }
        }
        return sum;
    }
}


