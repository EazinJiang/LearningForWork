package com.promax.day10.q1;

import java.io.*;

public class CopyAndTrans {
    public static void main(String[] args) {
        // 1. 用File对象封装目录
        File test = new File("homework\\src\\com\\promax\\day10\\q1\\test");

        // 2. 通过listFiles()方法获取该目录下所有的文件或者文件夹的File对象数组
        File[] files = test.listFiles();

        // 3. 遍历这个File数组，得到每一个File对象
        for (File file : files) {
            // 4. 判断该File对象是否是文件
            if (file.isFile()){
                String filename = file.getName();
                if (filename.endsWith(".java")){
                    // 复制文件
                    String copyPath = file.getPath().replace("test", "copy");
                    File copy = new File(copyPath);
                    try (
                        FileInputStream is = new FileInputStream(file);
                        FileOutputStream os = new FileOutputStream(copy);
                        BufferedInputStream bis = new BufferedInputStream(is);
                        BufferedOutputStream bos = new BufferedOutputStream(os);
                    ){
                        // 复制文件
                        byte[] bytes = new byte[1024];
                        int len;
                        while ((len = bis.read(bytes)) != -1){
                            bos.write(bytes, 0, len);
                        }
                        // 改名
                        copyPath = copyPath.replace(".java", ".txt");
                        // 发现不手动关闭bos的话无法重命名
                        bos.close();
                        copy.renameTo(new File(copyPath));

                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            }
        }
    }
}
