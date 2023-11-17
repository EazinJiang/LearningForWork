package com.liu.day02.q1;

public class Frog extends Animal implements Swim{
    // 定义青蛙类:frog
    //		行为:
    //			吃饭(吃虫子)和 游泳(蛙泳)

    @Override
    public void swimming() {
        System.out.println("蛙泳");
    }

    public void eat(){
        System.out.println("青蛙吃虫子");
    }

}
