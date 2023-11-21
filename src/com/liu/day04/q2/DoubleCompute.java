package com.liu.day04.q2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleCompute {
    public static void main(String[] args) {
        double a = 0.01;
        double b = 0.05;

        System.out.println(BigDecimal.valueOf(a).divide(BigDecimal.valueOf(b), 2, RoundingMode.HALF_UP));
    }
}
