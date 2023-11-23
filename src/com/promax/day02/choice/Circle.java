package com.promax.day02.choice;


public  class Circle extends ClassB implements B{
    public void pX(){
        System.out.println(super.a);
    }
    public static void main(String[] args) {
        new Circle().pX();
    }



}
