package com.liu.day04_2.q2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class YearOfJob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的入职时间(xxxx-xx-xx):");

        // 获取入职时间
        String date = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-dd");
        LocalDate start = LocalDate.parse(date, formatter);

        // 获取现在时间
        LocalDate end = LocalDate.now();
        Period period = Period.between(start, end);

        int years = period.getYears();
        System.out.println("您入职已经有" + years + "年了");


    }
}
