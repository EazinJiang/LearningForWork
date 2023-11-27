package com.promax.day07.q2;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Ball {
    public static void main(String[] args) {
        // 红色球号码区由1-33共三十三个号码组成，蓝色球号码区由1-16共十六个号码组成。
        Random random = new Random();

        int blue = random.nextInt(16) + 1;

        TreeSet<Integer> red = new TreeSet<>();

        while (red.size() < 5){
            red.add(random.nextInt(33) + 1);
        }


        System.out.print("红球：" + red);
        System.out.println(" | 蓝球：" + blue);

    }
}
