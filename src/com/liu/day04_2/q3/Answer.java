package com.liu.day04_2.q3;

import java.util.Arrays;
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        //1.创建Scanner对象,输入要添加商品的价格
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入新商品的价格:");
        double num = sc.nextDouble();
        //2.定义老数组,存储原始商品的价格
        double[] oldPrice = {23.6,34.4,35.3,36.2,78.8,89.6,100.3};
        //3.定义新数组,将新商品的价格添加到新数组中
        double[] newPrice = new double[oldPrice.length+1];

        //4.将老数组中的价格复制到新数组中
        System.arraycopy(oldPrice,0,newPrice,0,oldPrice.length);

        //5.将新添加的商品价格放到新数组中
        newPrice[newPrice.length-1] = num;

        //6.将新添加的商品价格放到新数组中,重新排序
        Arrays.sort(newPrice);

        //7.展示排序之后的新数组
        System.out.println(Arrays.toString(newPrice));
    }
}
