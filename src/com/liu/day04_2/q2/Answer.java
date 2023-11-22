package com.liu.day04_2.q2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) throws ParseException {
        // 1. 接受键盘录入的入职日期字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您入职的日期,格式为：xxxx年xx月xx日");
        String joinStr = sc.next();
        // 2. 将日期字符串转换为日期对象，方便获取毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date joinDate = sdf.parse(joinStr);
        // 3. 获取入职日期的毫秒值
        long joinTime = joinDate.getTime();
        // 4. 获取今天的毫秒值
        long todayTime = System.currentTimeMillis();
        // 5. 计算时间差
        long result = todayTime - joinTime;
        //6.将单位换算成天
        long day = result / 1000 / 60 / 60 / 24;
        int year = (int) (day/365);
        //7.将天换算成年,并打印
        System.out.println("您入职公司已经" + year + "年");
    }
}
