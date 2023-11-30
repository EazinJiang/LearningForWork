package com.promax.day09.q3;

import java.io.*;
import java.text.DecimalFormat;

public class Progress {
    public static void main(String[] args) {
        File origin = new File("homework\\src\\com\\promax\\day09\\q3\\origin.txt");
        File copy = new File("homework\\src\\com\\promax\\day09\\q3\\copy.txt");

        try (
                FileInputStream is = new FileInputStream(origin);
                FileOutputStream os = new FileOutputStream(copy);

                BufferedInputStream bis = new BufferedInputStream(is);
                BufferedOutputStream bos = new BufferedOutputStream(os);
        ){
            Long fileLen = origin.length();
            Double havedown = 0.0;
            DecimalFormat df = new DecimalFormat("##%");

            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes))!= -1){
                bos.write(bytes,0,len);
                havedown += len;
                String format = df.format(havedown / fileLen);
                System.out.println(format);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
