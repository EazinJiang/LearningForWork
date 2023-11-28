package com.promax.day08.q1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 1. 键盘录入一个新文件夹路径判断该路径是否存在
        //	- 如果存在，则什么都不做
        //	- 如果不存在，则创建该文件夹
        System.out.println("请输入创建的文件夹");
        File file = new File(sc.next());
        if (!file.isFile()){
            file.mkdirs();
        }

        //	2. 键盘录入一个路径，并将该路径指向的文件或文件夹删除；
        System.out.println("请输入要删除的文件/文件夹");
        File dir = new File(sc.next());
        deleteFile(dir);

        //	3. 获得指定文件夹下所有的java文件(不考虑子文件夹的)并输出到控制台
        System.out.println("请输入要查看的文件夹");
        File dir2 = new File(sc.next());
        String[] list = dir2.list();
        Arrays.stream(list).filter(name -> name.endsWith(".java")).forEach(System.out::println);

        //	4. 统计任意一个文件夹的大小 （length()方法可以获取文件的大小）
        System.out.println("请输入要删除的文件/文件夹");
        File file2 = new File(sc.next());
        System.out.println("大小为：" + file2.length());

        //	5. 键盘录入一个路径，将指定路径下的小于200K的小文件，并打印
        System.out.println("请输入目标路径：");
        File dir3 = new File(sc.next());
        File[] files = dir2.listFiles();
        Arrays.stream(files).filter(f -> f.length() < 200*1024).forEach(System.out::println);

    }



    public static void deleteFile(File dir){

        if (dir == null || !dir.exists()){
            System.out.println("null");
            return;
        }
        if (dir.isFile()) {
            System.out.println("delete file");
            dir.delete();
            return;
        }

        File[] files = dir.listFiles();
        // null说明没有权限
        if(files == null){
            return;
        }

        for (File file : files) {
//            deleteFile(file);
        }
        // 最后记得将本文件删掉！
        dir.delete();

    }

}
