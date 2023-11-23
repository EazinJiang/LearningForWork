package com.promax.day02.q1;

public class Animal implements Swim{
    // 定义动物类:
    //		属性:
    //			年龄
    //		行为:
    //			喝水,吃东西(吃什么不确定)

    private int age;

    void drink(){
        System.out.println("喝水");
    }

    void eat(){
        System.out.println("吃东西");
    }

    @Override
    public void swimming() {

    }
}
