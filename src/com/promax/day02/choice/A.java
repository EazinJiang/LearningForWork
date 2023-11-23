package com.promax.day02.choice;

public interface A {
    static void method(){
        System.out.println("A-method");
    }
    default void show(){
        System.out.println("A-show");
    }
}
