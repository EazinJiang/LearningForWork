package com.promax.day04_2.q4;

public class Answer {
    public static void main(String[] args) {
        // 定义最小值
        double min = -10.8;
        // 定义最大值
        double max = 5.9;
        // 定义变量计数
        int count = 0;
        // 范围内循环
        for (double i = Math.ceil(min); i <= max; i++) {
            // 获取绝对值并判断
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                // 计数
                count++;
            }
        }
        System.out.println("个数为: " + count + " 个");
    }
}
