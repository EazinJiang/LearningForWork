package com.promax.day02.choice;

public interface B {

    int a = 10;
    static void method(){
        System.out.println("B-method");
    }
    default void show(){
        System.out.println("B-show");
    }
}
