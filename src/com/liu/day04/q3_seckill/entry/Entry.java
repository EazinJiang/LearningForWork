package com.liu.day04.q3_seckill.entry;
import com.liu.day04.q3_seckill.task.TimeTask;

import java.text.ParseException;
import java.util.Timer;

public class Entry {

    public static void main(String[] args) throws ParseException {

        // 创建一个定时器对象
        Timer timer = new Timer() ;
        timer.schedule(new TimeTask(), 0 , 1000);         // 每隔1秒执行一次

    }

}
