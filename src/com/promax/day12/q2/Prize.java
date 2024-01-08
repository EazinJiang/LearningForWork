package com.promax.day12.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Prize {

    private List<Integer> prizeList = new ArrayList<>();


    public List<Integer> getPrizeList() {
        return prizeList;
    }

    public void setPrizeList(List<Integer> prizeList) {
        this.prizeList = prizeList;
    }

    public Prize(List<Integer> prizeList) {
        this.prizeList = prizeList;
    }

    public void selectPrize(){
        String name = Thread.currentThread().getName();
        Random r = new Random();
        List<Integer> result = new ArrayList<>();

        Integer sum = 0;
        Integer max = 0;

        for (int i = 0; i < 6; i++) {
            if (prizeList.size() == 0) return;
            Integer price1 = prizeList.remove(r.nextInt(prizeList.size()));
            sum += price1;
            if (price1 > max) max = price1;
            System.out.println(name + "抽出了一个" + price1 + "大奖");
            result.add(price1);
        }


        String s = "在此次抽奖过程中，" + name +"总共产生了6个奖项，分别为："+
                result + "最高奖项为"+ max+"元，总计额为"+sum +"元";
        System.out.println(s);

    }
}

