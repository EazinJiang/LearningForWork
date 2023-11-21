package com.liu.day04.q1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Shop {
    public static void main(String[] args) {
        BigDecimal phone = new BigDecimal("3999");
        BigDecimal film = new BigDecimal("9.9");

        BigDecimal xiaoming = film.multiply(BigDecimal.valueOf(2)).add(phone);
        System.out.println("商品总价：" + xiaoming);

        if (xiaoming.subtract(BigDecimal.valueOf(4000)).doubleValue() > 0){
            xiaoming = xiaoming.multiply(BigDecimal.valueOf(0.98));
            xiaoming = xiaoming.setScale(2, RoundingMode.HALF_UP);
            System.out.println("折后价格：" + xiaoming);
        }else {
            xiaoming = xiaoming.setScale(2, RoundingMode.HALF_UP);
            System.out.println("不打折，价格：" +xiaoming);
        }


    }
}
