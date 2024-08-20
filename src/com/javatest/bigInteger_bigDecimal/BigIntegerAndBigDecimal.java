package com.javatest.bigInteger_bigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerAndBigDecimal {
    public static void main(String[] args) {

        BigInteger bi = new BigInteger("2390857102938517238191239");
        BigInteger bi1 = new BigInteger("100");

        System.out.println(bi.add(bi1));
        System.out.println(bi.subtract(bi1));
        System.out.println(bi.multiply(bi1));
        System.out.println(bi.divide(bi1));

        BigDecimal bd = new BigDecimal("23.23463451345345656453245");
        BigDecimal bd1 = new BigDecimal("23.2346");

        System.out.println(bd.add(bd1));
        System.out.println(bd.subtract(bd1));
        System.out.println(bd.multiply(bd1));
        //如果有没有限循环小数，就会保留分子的精度
        //在调用divide方法时，指定精度即可  BigDecimal.ROUND_CEILING
        System.out.println(bd.divide(bd1,BigDecimal.ROUND_CEILING));

    }
}
