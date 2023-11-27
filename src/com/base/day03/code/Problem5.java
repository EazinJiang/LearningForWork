package com.base.day03.code;

public class Problem5 {
    public static void main(String[] args) {
        // 1.打印所有四位数中 个位 + 千位 == 百位 + 十位 的数字
        // 2.最后要打印符合条件的数字的总数量

        int start = 1000;
        int end = 9999;

        int count = 0;

        for (int i = start; i <= end; i++) {
            int ge = i % 10;
            int shi = (i % 100) / 10;
            int bai = (i % 1000) / 100;
            int qian = i / 1000;
            if ((ge + qian) == (shi + bai)){
                System.out.println(i);
                count ++;
            }
        }
        System.out.println("符合条件的数字数量为：" + count);
    }
}
