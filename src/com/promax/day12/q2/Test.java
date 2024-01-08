package com.promax.day12.q2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> prices = new ArrayList<>();
        prices.add(10);
        prices.add(5);
        prices.add(20);
        prices.add(50);
        prices.add(100);
        prices.add(200);
        prices.add(500);
        prices.add(800);
        prices.add(2);
        prices.add(80);
        prices.add(300);
        prices.add(700);

        Prize prize = new Prize(prices);

        MyTread myTread1 = new MyTread(prize, "抽奖箱1");
        MyTread myTread2 = new MyTread(prize, "抽奖箱2");

        myTread1.start();
        myTread2.start();
    }
}
