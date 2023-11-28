package com.base.day05.code;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Problem1 {
    // 定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个小数：");
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        System.out.println(getMin(a,b));

    }

    public static Double getMin(Double a, Double b){
        return a > b ? b : a;
    }

}
