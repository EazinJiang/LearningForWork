package com.promax.day09.q2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

public class CopyDir {
    public static HashSet<String> dirPaths = new HashSet<>();
    public static HashSet<String> filePaths = new HashSet<>();

    public static void main(String[] args) throws IOException {
        // 这里用origin和copy两个文件夹模拟D盘和E盘
        File file = new File("homework\\src\\com\\promax\\day09\\q2\\origin");

        // 用递归获取最内文件夹的和文件的路径
        getDirs(file);

        // 先创建文件夹
        for (String dirPath : dirPaths) {
            // 处理文件名
            String copyPath = dirPath.replace("origin", "copy");
            // 创建文件
            File copyDirs = new File(copyPath);
            System.out.println(copyDirs.mkdirs());
        }

        // 创建文件
        for (String filePath : filePaths) {
            // 处理文件名
            String copyath = filePath.replace("origin", "copy");
            // 创建文件
            File copyfile = new File(copyath);
            System.out.println(copyfile.createNewFile());

            // 复制文件数据
            try(
                    FileInputStream is = new FileInputStream(filePath);
                    FileOutputStream os = new FileOutputStream(copyfile,true);
                    BufferedInputStream bis = new BufferedInputStream(is);
                    BufferedOutputStream bos = new BufferedOutputStream(os);
                    ){
                byte[] bytes = new byte[1024];
                int len;
                while ((len = bis.read(bytes))!= -1){
                    bos.write(bytes,0,len);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }



    }

    // 用递归获取所有的最后一级文件或文件夹
    public static void getDirs(File file){
        File[] files = file.listFiles();
        // 如果该文件夹是空的，则放在文件夹集合中,返回
        if (files.length == 0){
            dirPaths.add(file.getPath());
            return;
        }
        // 遍历数组
        for (File file1 : files) {
            // 如果是文件，就把路径放在文件路径集合，把上层路径放在文件夹路径，并返回
            if (file1.isFile()){
                filePaths.add(file1.getPath());
                dirPaths.add(file.getPath());
            }else {
                getDirs(file1);
            }
        }


    }
}
