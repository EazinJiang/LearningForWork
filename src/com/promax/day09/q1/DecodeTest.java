package com.promax.day09.q1;

import java.io.*;

public class DecodeTest {
    public static void main(String[] args) {
        byte code = 8;

        try (
                InputStream is = new FileInputStream("homework\\src\\com\\promax\\day09\\q1\\encode.txt");
                BufferedInputStream bis = new BufferedInputStream(is);
        ){
            // 解码
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1){
                for (int i = 0; i < len; i++) {
                    // 用异或操作
                    bytes[i] = (byte) (bytes[i] ^ code);
                }
                System.out.println(new String(bytes ,0,len));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
