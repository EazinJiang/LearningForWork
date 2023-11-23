package com.promax.day04_2.q5;

import java.math.BigDecimal;
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入要转的金额:");
        String money = sc.next();
        //调用转换金额的方法
        Double aDouble = yuanToFen(money);
        System.out.println(aDouble);
    }
    public static Double yuanToFen(String money){
        //创建BigDecimal对象
        BigDecimal money1 = new BigDecimal(money);
        BigDecimal money2 = new BigDecimal("100");
        //将要转账的金额乘以100,变成分的单位
        BigDecimal multiply = money1.multiply(money2);
        //将分单位的金额除以100变成元,并且保留2位小数,展示给用户
        BigDecimal divide = multiply.divide(money2, 2, BigDecimal.ROUND_DOWN);
        //将BigDecimal对象转成double,并返回
        double v = divide.doubleValue();
        return v;
    }
}
