package com.ikwunze;

import java.math.BigDecimal;

public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.max(5,6));
        System.out.println(Math.sqrt(49));

//        double squareRoot = Math.sqrt(100);

        BigDecimal squareRoot1 = BigDecimal.valueOf(Math.sqrt(100)).setScale(2);
        System.out.println(squareRoot1);
    }
}
