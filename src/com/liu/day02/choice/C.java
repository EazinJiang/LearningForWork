package com.liu.day02.choice;

public interface C extends A,B{


    @Override
    default void show() {
        A.super.show();
    }
}
