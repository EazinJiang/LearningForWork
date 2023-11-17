package com.liu.day02.q1;

public class Breeder {
    // 定义饲养员类:breeder
    //		行为:
    //			饲养动物breed:包括吃饭和喝水

    void breed(Animal animal){
        animal.eat();
        animal.drink();
    }
}
