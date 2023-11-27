package com.base.day03.code;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // 1.根据程序员的工龄(整数)给程序员涨工资(整数),程序员的工龄和基本工资通过键盘录入
        // 2.涨工资的条件如下：[10-15)+20000   [5-10)+10000   [3~5)+5000    [1~3)+3000

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入作为程序员的你的工作的工龄:");
        int years = scanner.nextInt();
        System.out.println("请输入作为程序员的你的基本工资为:");
        int money = scanner.nextInt();

        // 定义应涨工资
        int increase = 0;

        if (years >= 10 && years < 15){
            increase = 20000;
        }else if (years >= 5 && years < 10){
            increase = 10000;
        }else if (years >= 3 && years < 5){
            increase = 5000;
        }else if (years >= 1 && years < 3){
            increase = 3000;
        }

        System.out.println("您目前工作了" + years
                + "年，基本工资为" + money
                + "元, 应涨工资" + increase
                + "元,涨后工资" + (money + increase) + "元");
    }
}
