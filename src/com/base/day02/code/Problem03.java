package com.base.day02.code;

public class Problem03 {
    public static void main(String[] args) {
        // 某外卖商家的菜品单价如下:
        //    1.鱼香肉丝每份24元,油炸花生米每份8元,米饭每份3元。
        //    2.优惠方式:
        //        总金额大于100元,总金额打9折,其它无折扣
        //    3.需求:
        //        小明购买了3分鱼香肉丝,3份花生米,5份米饭,最终需要付多少钱?

        int yuXiaoRouSi = 24;
        int HuaShengMi = 8;
        int rice = 3;

        double xming = 3 * yuXiaoRouSi + 3 * HuaShengMi + 5 * rice;

        if (xming >= 100){
            xming *= 0.9;
        }
//        //答案版：根据优惠方式计算小明购买菜品优惠后的价格,保存int变量afterPrice中
//        int afterPrice = (xming > 100) ? (int) (xming * 0.9) : xming;

        System.out.println("需要付" + xming);


    }
}
