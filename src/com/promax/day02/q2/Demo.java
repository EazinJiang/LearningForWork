package com.promax.day02.q2;

public class Demo {
    // 定义测试类Test，在main方法实现以下功能：
    //	* 创建TV对象；
    //	* 创建RemoteControl对象,调用其controlTV的方法
    public static void main(String[] args) {
        TV tv = new TV("芒果TV");
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.controlTV(tv);
    }
}
