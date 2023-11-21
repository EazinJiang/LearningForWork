package com.liu.day04.q3_seckill.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimerTask;

public class TimeTask extends TimerTask {

    // 定义秒杀开始时间
    private long startTime ;

    // 构造方法，对秒杀开始时间进行初始化
    public TimeTask() throws ParseException {

        // 补全代码
        String start = "2023-11-22 08:00:00";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = format.parse(start);
        startTime = parse.getTime();

    }

    @Override
    public void run() {                                 // 每一秒执行一次该方法

        // 补全代码
        Date now = new Date();
        Long period = startTime - now.getTime();
        period /= 1000;
        Long hours = period/3600;
        Long mins = period % 3600 / 60;
        Long sec = period % 3600 % 60;
        System.out.println("距离你明天的起床时间还有：" + hours + "小时" + mins + "分钟" + sec + "秒");


    }

}
