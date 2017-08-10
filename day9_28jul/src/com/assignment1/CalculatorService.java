package com.assignment1;

/**
 * Created by pradhanb on 7/28/2017.
 */
public class CalculatorService {
    public static void main(String[] args) {
        CalculatorAPI.evaluate(13.00,15.00,(val1, val2) -> {
            System.out.printf("Sum of %s and %s is %s",val1,val2,(val1+val2));
            System.out.printf("Difference of %s and %s is %s",val1,val2,(val1-val2));
            System.out.printf("Product of %s and %s is %s",val1,val2,(val1*val2));
            System.out.printf("Divison of %s by %s is %s",val1,val2,(val1/val2));
        });
    }
}
