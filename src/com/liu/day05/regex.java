package com.liu.day05;

import java.util.Arrays;

public class regex {
    public static void main(String[] args) {
        System.out.println("back".matches("\\w{4}-\\w{3}|\\w{4}"));
        System.out.println("010)62661617".matches("[0-9(-)]+"));

    }
}
