package com.promax.day07.q1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 这题我做得似乎很麻烦
public class Identity {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("3726221951dg010416");
        set.add("37222219700211041X");
        set.add("37242219680208044x");
        set.add("354221968020850444");
        set.add("37262319800904575x");
        set.add("3722231as303a99673");
        set.add("3711sad98603040033");
        set.add("373522198511190042");
        set.add("3755sad1991112998x");


        // 利用迭代器遍历集合元素并输出
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();

            if(!s.matches("[1-9]\\d{16}[Xx0-9]")){
                iterator.remove();
                continue;
            }
            System.out.println(s);
        }

    }
}
