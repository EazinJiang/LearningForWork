package com.promax.day13.q1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class SeverReaderThread extends Thread{

    private static final String word = "敏感";
    private Socket socket;
    private String path;

    public SeverReaderThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try (
                InputStream is = socket.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                ){
            while (true){
                path = dis.readUTF();
                System.out.println("接受到客户端上传文件：" + path);
                try (
                        FileReader fr = new FileReader("homework\\src\\com\\promax\\day13\\q1\\" + path);
                        BufferedReader br = new BufferedReader(fr);
                        Writer fw = new FileWriter("homework\\src\\com\\promax\\day13\\q1\\copy.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        ){
                    String line;
                    while ((line = br.readLine()) != null){
                        line = line.replaceAll("敏感", "**");
                        bw.write(line);
                        bw.newLine();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
         }catch (Exception e){
            e.printStackTrace();
        }

    }
}
