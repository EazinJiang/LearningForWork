package com.base.day02.code;

public class Problem01 {
    public static void main(String[] args) {
        int father= 177;
        int mother = 165;

        int son = (int) ((father + mother) * 1.08 / 2);
        int daughter = (int) ((father * 0.923 + mother) / 2);
        System.out.println("儿子身高为：" + son);
        System.out.println("女儿身高为：" + daughter);

    }

}
