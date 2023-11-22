package com.liu.day04_2.q3;

import java.util.Arrays;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        // 定义旧商品价格
        double[] oldPrice = {23.6,34.4,35.3,36.2,78.8,89.6,100.3};

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入新商品的价格：");
        double price = scanner.nextDouble();

        double[] newPrices = new double[oldPrice.length + 1];

        // arraycopy
        System.arraycopy(oldPrice,0,newPrices,0,oldPrice.length);

        newPrices[newPrices.length - 1] = price;

        Arrays.sort(newPrices);

        System.out.println("排序后：" + Arrays.toString(newPrices));

    }
}
