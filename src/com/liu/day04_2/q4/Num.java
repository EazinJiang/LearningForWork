package com.liu.day04_2.q4;

public class Num {
    public static void main(String[] args) {
        double start = -10.8;
        double end = 5.9;

        double ceil = Math.ceil(start);
        int count = 0;

        while (ceil <= end){
            double abs = Math.abs(ceil);
            if (abs < 2.1 || abs > 6){
                System.out.println("区间内整数" + ceil + "符合要求");
                count++;
            }else {
                System.out.println("区间内整数" + ceil + "不符合要求");
            }
            ceil ++;
        }

        System.out.println("符合要求的数字一共" + count + "个");
    }
}
