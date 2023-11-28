package com.promax.day08.q3;

public class Mogu {
    public static void main(String[] args) {
        // 每次吃一半多一个, 第十天只剩一个
        // 第一天多少个？
        int num = getNum(1);
        System.out.println(num);  // 1534


    }

    public static int getNum(int day){
        // 出口：第十天只剩一个
        if (day == 10) return 1;

        // 递归：今天的数量 = (后一天的数量 + 1) * 2
        else return (getNum(day + 1) + 1) * 2;
    }
}
