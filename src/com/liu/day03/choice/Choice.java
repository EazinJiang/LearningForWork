package com.liu.day03.choice;


public class Choice {
//    Integer i;  // 不自动赋值为0，默认是空指针
    int i;
    int x;

    public Choice(int y){
        x = i + y;
        System.out.println(x);
    }

    public static void main(String[] args) {
        new Choice(new Integer(3));
    }
}
