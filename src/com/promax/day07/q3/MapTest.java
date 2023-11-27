package com.promax.day07.q3;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {

        String str = "1.2,3.4,5.6,7.8,5.56,44.55";

        // 以逗号作为分隔符，把已知的字符串分成一个String类型的数组
        String[] strs = str.split(",");

        // 把"."左边的元素作为key，右边的元素作为value，封装到Map中，Map中的key和value都是Object类型。
        Map map = new HashMap<>();
        for (String s : strs) {
            String[] keyValue = s.split("\\.");
            map.put(keyValue[0], keyValue[1]);
        }

        // 把map中的key封装的Set中，并把Set中的元素输出。
        Set set = map.keySet();
        System.out.println(set);

        // 把map中的value封装到Collection中，把Collection中的元素输出。
        Collection collection = map.values();
        System.out.println(collection);
    }
}
