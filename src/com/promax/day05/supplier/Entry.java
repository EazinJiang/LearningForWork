package com.promax.day05.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Entry {

    // 验证码可选字符
    private static final String OPTIONS_CAHS = "023456789abcdefghjklmnopqrstuvwxyz" ;

    public static void main(String[] args) {

        // 在等号的右边补全代码
        // 还能简写吗？感觉好奇怪，因为要重复循环选取数字所以感觉应该不能简写了吧
        String verificationCode = verificationCode(() -> {
            Random random = new Random();
            String result = "";
            for (int i = 0; i < 4; i++) {
                result += OPTIONS_CAHS.charAt(random.nextInt(OPTIONS_CAHS.length()));
            }
            return result;
        });

        // 输出
        System.out.println("本次生成的验证码为：" + verificationCode);

    }

    // 调用该方法生成一个4位的随机验证码
    public static String verificationCode(Supplier<String> supplier) {
        return supplier.get() ;
    }

}
