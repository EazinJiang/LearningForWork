package com.promax.day11.q2;

import java.io.*;
import java.util.Scanner;

public class SongsTest {

    public static final String word = "请选择您要进行的操作：1：查询所有歌曲   2：根据歌曲名称复制  3：根据歌曲名称删除 4: 退出";

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String flag;

        while (true){
            System.out.println(word);
            flag = sc.nextLine();
            switch (flag){
                case "1":
                    showSongs();
                    continue;
                case "2":
                    System.out.println("请输入要复制的歌曲名称");
                    String name = sc.nextLine();
                    System.out.println("请输入存储路径:");
                    String copyPath = sc.nextLine();
                    copySong(name, copyPath);
                    continue;
                case "3":
                    System.out.println("请输入要删除的歌曲名称：");
                    String song = sc.nextLine();
                    deleteSong(song);
                    continue;
                case "4":
                    return;
                default:
                    System.out.println("该命令不存在，请重新输入！");
            }
        }
    }

    public static void showSongs(){
        File file = new File("homework\\src\\com\\promax\\day11\\q2\\songs");
        String[] songs = file.list();
        System.out.println("存在以下歌曲：");
        for (String song : songs) {
            System.out.println(song.substring(0,song.indexOf(".")));
        }
    }

    public static void copySong(String name, String copyPath) {
        String path = "homework\\src\\com\\promax\\day11\\q2\\songs\\" + name +".txt";
        copyPath = "homework\\src\\com\\promax\\day11\\q2\\songs\\" + copyPath;

        File file = new File(copyPath);
        file.mkdirs();

        copyPath = copyPath + "\\" + name +".txt";

        try(
                // 定义字节缓冲流包装原始的字节流: 传参需要是字节流
                InputStream is = new FileInputStream(path);
                // 默认是8kb的缓冲池
                InputStream bis = new BufferedInputStream(is);

                OutputStream os = new FileOutputStream(copyPath);
                OutputStream bos = new BufferedOutputStream(os);
        ){
            byte[] buffer = new byte[1024];
            int len;
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
            System.out.println("复制完成");

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void deleteSong(String name){
        String path = "homework\\src\\com\\promax\\day11\\q2\\songs\\" + name +".txt";

        File file = new File(path);
        file.delete();
        System.out.println("删除成功！");
    }
}
