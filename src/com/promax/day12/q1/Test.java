package com.promax.day12.q1;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Present present = new Present();
        Thread hong = new MyThread(present,"hong");
        Thread ming = new MyThread(present, "ming");
        hong.start();
        ming.start();

        hong.join();
        ming.join();

        System.out.println("小红发的礼物数是：" + present.getMap().get("hong"));
        System.out.println("小明发的礼物数是：" + present.getMap().get("ming"));

    }
}
