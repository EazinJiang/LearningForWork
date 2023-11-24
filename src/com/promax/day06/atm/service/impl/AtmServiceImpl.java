package com.promax.day06.atm.service.impl;

import com.promax.day06.atm.service.AtmService;
import com.promax.day06.atm.utils.MoneyIllegalException;
import com.promax.day06.atm.utils.MoneyInsufficientException;

public class AtmServiceImpl implements AtmService {          // atm机业务处理类

    // 定义总金额
    private double totalMoney = 20000 ;

    // 取钱的方法
    @Override
    public double drawMoney(double money) {
        if (money < 0){
            throw new MoneyIllegalException();
        }else if (money > totalMoney){
            throw new MoneyInsufficientException();
        }else {
            return totalMoney - money ;
        }

    }

}
