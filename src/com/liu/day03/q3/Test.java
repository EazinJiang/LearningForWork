package com.liu.day03.q3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入相应的付款方式编号：");

        String num = scanner.next();

        System.out.println(Shop.get(num));

    }
}
