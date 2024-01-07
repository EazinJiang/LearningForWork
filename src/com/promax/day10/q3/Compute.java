package com.promax.day10.q3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Compute {
    public static void main(String[] args) {
        // 1. 应该从文件中，把数据一行一行读出来

        try(
                Reader r = new FileReader("homework\\src\\com\\promax\\day10\\q3\\question.text");
                BufferedReader br = new BufferedReader(r);

                Writer w = new FileWriter("homework\\src\\com\\promax\\day10\\q3\\question.text",true);
                BufferedWriter bw = new BufferedWriter(w);
                ){
            String line;
            ArrayList<String> results = new ArrayList<>();
            while ((line = br.readLine()) != null){
                int result;
                // 2. 拿到数据后，判断哪个不是数字，则使用不是数字的字符，切割字符串
                if (line.contains("+")) result = plus(line);
                else if (line.contains("-")) result = minus(line);
                else if (line.contains("*")) result = multiply(line);
                else result = divide(line);
                results.add(line + "=" + result);
            }
            br.close();   // 要先关闭才可以写
            bw.newLine();
            bw.write("以下是计算结果：---------------------");
            for (String result : results) {
                bw.newLine();
                bw.write(result);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        // 2. 拿到数据后，判断哪个不是数字，则使用不是数字的字符，切割字符串
        // 3. 再把切割后的字符串，转成数字
        // 4. 再匹配切割的字符的类型，进行相应的操作
    }

    public static int plus(String s){
        String[] split = s.split("[+]");
        int num1 = Integer.parseInt(split[0]);
        int num2 = Integer.parseInt(split[1]);
        return num1 + num2;
    }

    public static int minus(String s){
        String[] split = s.split("-");
        int num1 = Integer.parseInt(split[0]);
        int num2 = Integer.parseInt(split[1]);
        return num1 - num2;
    }

    public static int multiply(String s){
        String[] split = s.split("[*]");
        int num1 = Integer.parseInt(split[0]);
        int num2 = Integer.parseInt(split[1]);
        return num1 * num2;
    }

    public static int divide(String s){
        String[] split = s.split("/");
        int num1 = Integer.parseInt(split[0]);
        int num2 = Integer.parseInt(split[1]);
        return num1 / num2;
    }
}
