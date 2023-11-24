package com.promax.day06.atm.entry;

import com.promax.day06.atm.service.AtmService;
import com.promax.day06.atm.service.impl.AtmServiceImpl;
import com.promax.day06.atm.utils.MoneyIllegalException;
import com.promax.day06.atm.utils.MoneyInsufficientException;

import java.util.Scanner;

public class Entry {

    public static void main(String[] args) {

        try {
            // 键盘录入取钱金额
            Scanner sc = new Scanner(System.in) ;
            System.out.println("请输入取钱金额: ");
            double drawMoney = sc.nextDouble();

            // 通过多态的方式创建AtmService对象
            AtmService atmService = new AtmServiceImpl() ;

            // 调用drawMoney方法进行取钱
            double money = atmService.drawMoney(drawMoney);

            // 输出剩余金额
            System.out.println("恭喜你，取钱成功! 本次取钱金额为：" + drawMoney + ", 剩余金额：" + money);
        }catch (MoneyInsufficientException e){
            System.out.println("账户余额不足！");
        }catch (MoneyIllegalException e){
            System.out.println("输入的取钱金额不合法！");
        }



    }

}
