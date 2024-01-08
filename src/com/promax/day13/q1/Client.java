package com.promax.day13.q1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
// 1、创建socket对象，并同时请求与服务端程序的连接
        Socket socket = new Socket("127.0.0.1",8888);

        // 2、从该通道中得到一个字节输出流，用来发数据给服务端
        OutputStream os = socket.getOutputStream();

        // 3、把低级字节输出流包装成数据输出流
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("欢迎光临！请上传文件(文本文件)！");
            String str = sc.nextLine();

            if (str.equals("exit")){
                System.out.println("已退出！");
                dos.close();
                socket.close();    // 释放连接资源
                break;
            }

            // 4、开始写数据出去
            dos.writeUTF(str);

            // ** 刷新！以防消息在缓冲区滞留
            dos.flush();
        }
    }
}
