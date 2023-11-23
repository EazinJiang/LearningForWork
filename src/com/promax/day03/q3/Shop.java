package com.promax.day03.q3;

public enum Shop {
    CHARGE_TYPE_CHARGED("10131001","自费"),
    CHARGE_TYPE_FREE("10131002","免费"),
    CHARGE_TYPE_MEMBER_RIGHTS("10131003","会员权益");

    private String num;
    private String type;

    Shop(String num, String type) {
        this.num = num;
        this.type = type;
    }

    public static String getTypeByNum(String num){
        Shop[] shops = Shop.values();
        for (Shop shop : shops) {
            if (shop.num.equals(num)) return shop.type;
        }

        return null;
    }
}
