package com.base.day02.code;

public class Problem02 {
    public static void main(String[] args) {
        int number = 1234;

        int thousand = number / 1000;
        number %= 1000;

        int hundred = number / 100;
        number %= 100;

        int ten = number / 10;
        number %= 10;

        System.out.println("千位是" + thousand + "，百位是" + hundred + "，十位是" + ten + "，个位是" + number);
    }
}
