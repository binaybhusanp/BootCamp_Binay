package com.com.assignment2;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by pradhanb on 7/28/2017.
 */
public class ArrayHolderTest {
    public static void main(String[] args) {
        Integer[] arr = {10,20,30,40,50,60,70,80,90};
        ArrayHolder arrayHolder = new ArrayHolder(arr);

        arrayHolder.forEach((Object a) -> {
            System.out.println(a);
        });
        System.out.println("=======================");
        arrayHolder.modify((Object a)-> {
            a = (int)a*2;
            return a;
            }
        );

    }
}
