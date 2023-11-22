package com.liu.day04_2.q1;

import java.util.Calendar;
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        //1.定义Scanner对象,调用nextInt方法键盘录入一个年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入年份:");
        int year = sc.nextInt();
        //2.调用getInstance()方法获取Calendar对象
        Calendar calendar = Calendar.getInstance();
            /*
              3.调用Calendar中的set方法设置年,月,日
                由于Calender月份从0开始,所以,当我们设置2月的时候其实代表的是3月
                年份:我们输入的年份
                月份:2月(实际上是我国3月份)
                日:1日
            */
        calendar.set(year,2,1);//代表3月1日
        //4.调用Calendar中的add方法,让3月1日减去1天,就是二月的最后一天
        calendar.add(Calendar.DATE,-1);
        //5.调用Calendar中的get方法,获取得出的日期
        int day = calendar.get(Calendar.DATE);
        //6.输出输入的年份2月有多少天
        System.out.println(year+"年的2月有"+day+"天");
        //7.判断,如果得出的日期==28天,证明是平年,共365天,否则就是闰年,共366天
        if (day==28){
            System.out.println("今年是平年!共365天");
        }else{
            System.out.println("今年是闰年!共366天");
        }
    }
}
