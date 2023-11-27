package com.base.day03.code;

import java.util.Scanner;

public class Problem4 {

/**从键盘上录入一个大于100的三位数,打印出100到该数字之间满足如下要求的数字,数字的个数,以及数字的和:
        1.数字的个位数不为7;
		2.数字的十位数不为5;
		3.数字的百位数不为3;
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于100的三位数：");
        int num = scanner.nextInt();

        int count = 0;
        int sum = 0;

        for (int i = 101; i < num; i++) {
            int s = i % 10;
            int t = (i % 100) / 10;
            int h = i / 100;
            if ((s != 7) && (t != 5) && (h != 3)){
                System.out.println(i);
                count ++;
                sum += i;
            }
        }
        System.out.println("个数为：" + count);
        System.out.println("数字的和为：" + sum);

    }
}
