package com.promax.day09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String argv[]) throws IOException {

    }

    public static int show() {
        try {
            System.out.println(1 / 0);  // 发生异常，终止
            System.out.println(111);
            return 1;
        } catch (Exception e) {
            System.out.println(222);
            return 2;
        } finally {
            System.out.println(333);
            return 3;  // 输出被覆盖为3
        }
    }
}
