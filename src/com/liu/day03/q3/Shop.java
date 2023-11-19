package com.liu.day03.q3;

public enum Shop {
    CHARGE_TYPE_CHARGED("10131001","自费"),
    CHARGE_TYPE_FREE("10131001","免费"),
    CHARGE_TYPE_MEMBER_RIGHTS("10131001","会员权益");

    private String num;
    private String type;

    Shop(String num, String type) {
        this.num = num;
        this.type = type;
    }

    public static String get(String num){
        switch (num){
            case "10131001" : return CHARGE_TYPE_CHARGED.type;
            case "10131002" : return CHARGE_TYPE_FREE.type;
            case "10131003" : return CHARGE_TYPE_MEMBER_RIGHTS.type;
        }

        return null;
    }
}
