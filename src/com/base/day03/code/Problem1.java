package com.base.day03.code;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // 让用户依次录入三个整数，求出三个数中的最大值，并打印到控制台。【使用if】
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = scanner.nextInt();

        System.out.println("请输入第二个整数：");
        int num2 = scanner.nextInt();

        System.out.println("请输入第三个整数：");
        int num3 = scanner.nextInt();

        System.out.print("他们中的最大整数为：");
        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1);
        }else if (num2 >= num1 && num2 >= num3){
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }
    }
}
