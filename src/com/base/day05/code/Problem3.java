package com.base.day05.code;

import com.sun.security.auth.NTNumericCredential;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        // 请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个小数：");
        double num = sc.nextDouble();

        System.out.println(getAbs(num));
    }

    public static double getAbs(double num){
        if (num < 0.0){
            num = -num;
        }
        return num;
    }
}
