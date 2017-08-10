package com.assignment1;

/**
 * Created by pradhanb on 7/26/2017.
 */
public class InvalidPriceException extends Exception {
    public InvalidPriceException() {
    }

    public InvalidPriceException(String message) {
        super(message);
    }
}
