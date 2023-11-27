package com.base.day04.code;

import java.util.Arrays;

public class Problem2to5 {
    public static void main(String[] args) {
        // 现有一个整数数组{100,50,90,60,80,70}。
        int[] arr = new int[]{100,50,90,60,80,70};

        int sum = 0;
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            // 2.请编写代码，计算数组中的所有元素的和并打印。
            sum += arr[i];
            // 3.请编写代码，计算数组中的所有元素的最小值并打印。
            if (arr[i] < min) min = arr[i];
            // 4.计算数组中的所有元素的最大值并打印。
            if (arr[i] > max) max = arr[i];
        }

        // 计算去掉最大值和最小值后的平均值（不考虑小数部分）
        int average = (sum - min - max) / (arr.length - 2);

        System.out.println("和为：" + sum);
        System.out.println("最小值为：" + min);
        System.out.println("最大值为：" + max);
        System.out.println("去最大和最小后的平均值为：" + average);



    }
}
