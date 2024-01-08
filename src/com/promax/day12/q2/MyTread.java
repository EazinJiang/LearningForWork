package com.promax.day12.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class MyTread extends Thread {
    private Prize prize;

    public MyTread(Prize prize, String name){
        this.prize = prize;
        this.setName(name);
    }

    @Override
    public void run() {
        prize.selectPrize();

    }
}
