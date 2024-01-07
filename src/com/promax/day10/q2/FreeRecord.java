package com.promax.day10.q2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FreeRecord {
    public static void main(String[] args) {
        // 第一次运行前执行初始化
//        init();

        // 记录次数
        int num = 0;

        // 读文件
        try (
                DataInputStream dis = new DataInputStream(new FileInputStream("homework\\src\\com\\promax\\day10\\q2\\record.txt"))
                ){
            num = dis.readInt();
            // 前三次：
            if (num <= 3){
                System.out.println("欢迎使用本软件,第" + num + "次使用免费~");
            }else {
                // 四次及以后
                System.out.println("本软件只能免费使用3次,欢迎您注册会员后继续使用~");
                return;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        // 更新，写文件
        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("homework\\src\\com\\promax\\day10\\q2\\record.txt"))
        ){

            dos.writeInt(++num);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void init(){
        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("homework\\src\\com\\promax\\day10\\q2\\record.txt"))
                ){
            dos.writeInt(1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
