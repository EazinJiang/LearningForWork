package com.base.day02.code;

import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        // 一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，
        //    请开发程序，可以通过键盘输入这三个和尚的身高，并计算出出这三个和尚的最高身高。

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个和尚的身高（以空格隔开）：");
        int monk1 = scanner.nextInt();
        int monk2 = scanner.nextInt();
        int monk3 = scanner.nextInt();

        System.out.print("他们中最高的身高是");

        if(monk1 >= monk2){
            System.out.println(monk1 >= monk3 ? monk1 : monk3);
        }else {
            System.out.println(Math.max(monk2, monk3));
        }

//        // 答案版：（计算最小身高）
//        //3.使用三元运算符计算h1和h2的最小值,保存int变量temp中
//        int temp = (h1 < h2) ? h1 : h2;
//        //3.使用三元运算符计算temp和h3的最小值,保存int变量min中
//        int min = (temp < h3) ? temp : h3;
//        //4.打印结果数据min
//        System.out.println("三个和尚的最小身高: " + min);
    }
}
