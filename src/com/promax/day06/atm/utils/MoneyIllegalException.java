package com.promax.day06.atm.utils;

public class MoneyIllegalException extends RuntimeException{

    public MoneyIllegalException() {
    }

    public MoneyIllegalException(String message) {
        super(message);
    }
}
