package com.promax.day04.q5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // 第一次休息日
        LocalDate start = LocalDate.of(2020,2, 1);

        // 获取输入,拼接该月第一天
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年-月");
        String str = scanner.next();
        String startTime = str + "-01";

        // 解析输入
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-dd");
        LocalDate now = LocalDate.parse(startTime, formatter);


        // 找到该月份的最大天数
        int days = now.lengthOfMonth();
        System.out.println("这个月的天数是：" + days);

        // 该月的最后一天：
        String endTime = str + "-" +days;
        LocalDate end = LocalDate.parse(endTime, formatter);

        // 与第一次的间隔天数
//        Duration duration = Duration.between(start, end);  必须传时分秒，差评
//        long gapDays = duration.toDays();
        Long gapDays = end.toEpochDay() - start.toEpochDay();
        System.out.println("间隔天数：" + gapDays);

        // 计算间隔天数中的休息日并放入集合中
        List<String> dates = new ArrayList<>();
        dates.add(start.format(formatter));   // 存进第一天休息日
        int count = 0;
        while ((count + 4)<= gapDays){
            count += 4;
            LocalDate holiday = start.plusDays(count);
            dates.add(holiday.format(formatter));
        }
        System.out.println("所有休息天数：" + Arrays.toString(dates.toArray()));

        // 计算本月修息天数并且给周末加[]
        int this_month_days = 0;
        for (int i = 0; i < dates.size(); i++) {
            String date = dates.get(i);
            if (date.startsWith(str)) this_month_days ++;
            LocalDate holiday = LocalDate.parse(date, formatter);
            int dayOfWeek = holiday.getDayOfWeek().getValue();
            if (dayOfWeek == 7 || dayOfWeek == 6){
                dates.set(i, ("[" + date + "]"));
            }
        }
        System.out.println("所有休息天数：" + Arrays.toString(dates.toArray()));
        System.out.println("本月休息天数：" + this_month_days);






    }
}
