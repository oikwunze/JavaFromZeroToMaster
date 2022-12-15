package com.ikwunze;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyBigDecimal {
    public static void main(String[] args) {
        System.out.println(10/3);
        System.out.println((double) 10/3);

        BigDecimal firstValue = BigDecimal.valueOf(10).setScale(2);
        BigDecimal secondvalue = BigDecimal.valueOf(3);
        BigDecimal division =  firstValue.divide(secondvalue, RoundingMode.HALF_UP);
        System.out.println("Dividing both values: " + division);
    }
}
