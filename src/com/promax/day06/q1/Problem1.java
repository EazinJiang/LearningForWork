package com.promax.day06.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Problem1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("学羊叫5声");
        list.add("蛙跳10个");
        list.add("吃芥末");
        list.add("喝一杯啤酒");
        list.add("做10个俯卧撑");

        List<String> person = new ArrayList<>();
        person.add("郭靖");
        person.add("黄蓉");
        person.add("黄药师");
        person.add("老顽童");
        person.add("瑛姑");


        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(list.size());
            System.out.println(person.get(i) + "抓到的阄为：" + list.get(index));

            list.remove(index);
        }

        

    }
}
