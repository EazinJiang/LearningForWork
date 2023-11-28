package com.base.day05.code;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // 定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数：");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(getMax(a, b, c));

    }

    public static int getMax(int a, int b, int c){
        if ((a >= b) && (a >= c)){
            return a;
        }else if ((b >= a) && (b >= c)){
            return b;
        }else return c;
    }
}
