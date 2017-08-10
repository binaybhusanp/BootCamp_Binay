package com.com.assignment2;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by pradhanb on 7/28/2017.
 */
public class ArrayHolder<Integer> {
    Integer[] numbers;
    Integer rs;

    public ArrayHolder(Integer[] numbers) {
        this.numbers = numbers;
    }
    public void forEach(Consumer<Integer> consumer){
        for (Integer num:numbers) {
            consumer.accept(num);
        }
    }
    void modify(Function<Integer,Integer> function) {
        for (Integer num:numbers) {
           rs = function.apply(num);
           num = rs;
            System.out.println(num);
        }
    }
}
