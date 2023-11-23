package com.promax.day04_2.q5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class FenAndYuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入转账金额：");

        String money = scanner.next();

        BigDecimal decimal = new BigDecimal(money);

        // 转成分：
        BigDecimal fen = decimal.multiply(BigDecimal.valueOf(100));
//        System.out.println("转成分后的值是：" + fen.doubleValue());

        // 转成元并保留两位
        BigDecimal yuan = fen.divide(BigDecimal.valueOf(100), 2, RoundingMode.FLOOR);
        System.out.println("保留两位小数后，您转账的金额为：" + yuan);

    }
}
