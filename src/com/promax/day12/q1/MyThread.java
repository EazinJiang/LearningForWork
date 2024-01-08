package com.promax.day12.q1;

import java.util.HashMap;

public class MyThread extends Thread{

    private Present present;

    public MyThread(Present present, String name){
        this.present = present;
        this.setName(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            present.sendPresent();
        }
    }
}
