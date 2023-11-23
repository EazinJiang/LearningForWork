package com.promax.day04_2.q1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Feb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        String year = scanner.next();

        String date = year + "-02-01";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-dd");

        LocalDate localDate = LocalDate.parse(date, formatter);
        int dayOfMonth = localDate.lengthOfMonth();
        int dayOfYear = localDate.lengthOfYear();

        System.out.println("二月天数：" + dayOfMonth);

        if (dayOfMonth == 28){
            System.out.println("该年是平年，一年的天数是：" + dayOfYear);
        }else if (dayOfMonth == 29){
            System.out.println("该年是闰年，一年的天数是：" + dayOfYear);
        }

    }
}
