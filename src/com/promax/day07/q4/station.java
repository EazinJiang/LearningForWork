package com.promax.day07.q4;

import java.util.*;

public class station {
    public static void main(String[] args) {
        Map<Integer, String> stations = new HashMap<>();
        stations.put(1,"黄花机场T1T2");
        stations.put(2,"木马塅");
        stations.put(3,"大路村");
        stations.put(4,"龙峰");
        stations.put(6,"檀木桥");
        stations.put(7,"龙华");
        stations.put(8,"韶光");
        stations.put(9,"东湖");
        stations.put(10,"农科院农大");

        stations.forEach((num, name) -> System.out.println(num + " - " + name));

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入上车站：");
        String start = sc.next();
        while (!stations.containsValue(start)){
            System.out.println("站点不存在，请重新输入：");
            start = sc.next();
        }
        System.out.println("请输入下车站：");
        String end = sc.next();
        while (!stations.containsValue(end)){
            System.out.println("站点不存在，请重新输入：");
            end = sc.next();
        }

        // 这里遍历找一下key，应该也可以存两张map互相关联。
        int begin = 0;
        int fin = 0;
        Set<Integer> keys = stations.keySet();
        for (Integer key : keys) {
            if (start.equals(stations.get(key))) begin = key;
            if (end.equals(stations.get(key))) fin = key;
        }

        int nums = Math.abs(fin - begin);
        int money = 0;
        int time = nums * 2;

        if (nums <= 3) money = 3;
        else if (nums < 5) money = 4;
        else money = 4 + (nums - 5)*2;

        if (money > 10) money = 10;

        System.out.println("从" + start + "到" + end + "共经过" + nums
                + "站，收费" + money + "元，大约需要" + time + "分钟");



    }
}
