package com.promax.day02.q2;

public class TV {
    // 定义电视类TV，要求包含：
    //   1)成员变量:名称 name（ String s）；
    //   2)构造器:空参、满参构造器；
    //   3)成员方法:public void play(String channel) ,方法内,打印输出 "xx电视正在播放xxx节目"（channel表示电视节目);

    private String name;

    public TV(String name) {
        this.name = name;
    }

    public TV() {
    }

    public void play(String channel){
        System.out.println(name + "电视正在播放" + channel);
    }
}
