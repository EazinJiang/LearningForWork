package com.promax.day06.atm.utils;

public class MoneyInsufficientException extends RuntimeException{

    public MoneyInsufficientException() {
    }

    public MoneyInsufficientException(String message) {
        super(message);
    }
}
