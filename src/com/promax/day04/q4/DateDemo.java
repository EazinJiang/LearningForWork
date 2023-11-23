package com.promax.day04.q4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入日期，格式为年-月-日:");

        String s = scanner.next();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-M-dd");
        Date date = format.parse(s);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int week = calendar.get(Calendar.DAY_OF_WEEK);
        int year = calendar.get(Calendar.YEAR);
        int day = calendar.get(Calendar.DAY_OF_YEAR);

        week = (week + 7) % 8;
        if (week == 0) week=7;

        System.out.println(s + "是星期" + week + ", 是" + year + "年的第" + day + "天。");


    }
}
