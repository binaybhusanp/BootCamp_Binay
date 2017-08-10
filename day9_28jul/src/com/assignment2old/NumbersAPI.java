package com.assignment2old;

/**
 * Created by pradhanb on 7/28/2017.
 */
public class NumbersAPI {
    int[] arr;

    public NumbersAPI(int[] arr) {
        this.arr = arr;
    }
    public void manipulate(Doubler doubler) { //here manipulate() acts as for each
        for (int values:arr) {
            doubler.multiplyByTwo(values); //calls the functional interface
        }
    }

}
