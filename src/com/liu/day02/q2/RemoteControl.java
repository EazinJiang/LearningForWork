package com.liu.day02.q2;

import java.util.Scanner;

public class RemoteControl {
    // 定义遥控器类RemoteControl,包含:
    //    成员方法:public void  controlTV(TV tv):方法内输出"遥控器控制电视",
    // 然后提示用户键盘录入一个字符串作为电视节目信息,调用tv的play方法,将节目信息作为参数传入；

    private Scanner scanner = new Scanner(System.in);

    public void  controlTV(TV tv){
        System.out.println("遥控器控制电视");
        System.out.println("请输入想看的节目：");
        String channel = scanner.next();
        tv.play(channel);
    }
}
