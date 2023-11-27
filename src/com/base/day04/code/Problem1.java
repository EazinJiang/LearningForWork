package com.base.day04.code;

public class Problem1 {
    public static void main(String[] args) {
        // 请使用静态初始化的方式,创建一个长度为5的整数数组,并为数组中的元素赋值,
        //	遍历数组,在同一行打印所有元素,元素之间用空格隔开,

        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // 换行
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                System.out.print("[");
            }
            System.out.print(arr[i]);
            if (i != arr.length - 1){
                System.out.print(", ");
            }else {
                System.out.print("]");
            }
        }
    }
}
