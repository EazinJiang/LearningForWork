package com.promax.day09.q1;

import java.io.*;

public class Encode {
    public static void main(String[] args) {

        byte code = 8;

        try (
                InputStream is = new FileInputStream("homework\\src\\com\\promax\\day09\\q1\\origin.txt");
                OutputStream os = new FileOutputStream("homework\\src\\com\\promax\\day09\\q1\\encode.txt");
                BufferedInputStream bis = new BufferedInputStream(is);
                BufferedOutputStream bos = new BufferedOutputStream(os);
            ){
                // 取出is中的数据编码
                byte[] bytes = new byte[1024];
                int len;
                while ((len = bis.read(bytes)) != -1){
                    for (int i = 0; i < len; i++) {
                        // 用异或操作加密
                        bytes[i] = (byte) (bytes[i] ^ code);
                    }
                    bos.write(bytes, 0, len);
                }
            }catch (Exception e){
                e.printStackTrace();
            }

    }
}
