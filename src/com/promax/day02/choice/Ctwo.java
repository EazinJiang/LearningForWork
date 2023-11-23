package com.promax.day02.choice;

public class Ctwo{
    public static void main(String[] args) {
        Cone o = new Cone();
        new Ctwo().addOne(o);
        System.out.println(o.i);
    }
    public void addOne(final Cone o) {
        o.i++;
    }
}
