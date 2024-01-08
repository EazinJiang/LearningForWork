package com.promax.day13.q1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 服务端要求：
        //使用多线程来侦听客户端请求；
        //如果有客户发出请求，则主动给每位客户端发送一句“欢迎光临！请上传文件(文本文件)！”；
        //用户上传后，将文件保存在本地，并回复上传成功；
        //如果客户端上传的文件中有敏感词汇，则替换成**，再保存。
        // 1、创建ServerSocket服务器对象，注册端口
        ServerSocket serverSocket = new ServerSocket(8888);


        // 2、使用serverSocket对象调用accept方法，等待客户端连接请求
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress() + "客户端登录" );
            new SeverReaderThread(socket).start();

        }
    }
}
