package com.liu.day02.q1;

public class Dog extends Animal implements Swim{
//    定义狗类:
//    行为:
//    吃饭(啃骨头)和 游泳(狗刨)
    void eat(){
        System.out.println("狗啃骨头");
    }

    @Override
    public void swimming() {
        System.out.println("狗刨");
    }
}
