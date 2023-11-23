package com.base.day02.code;

public class Problem04 {
    public static void main(String[] args) {
        // 动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg，
        //	请用程序实现判断两只老虎的体重是否相同。

        int tiger1 = 180;
        int tiger2 = 200;
        String s = tiger1==tiger2 ? "体重相同" : "体重不同";
        System.out.println(s);
    }
}
