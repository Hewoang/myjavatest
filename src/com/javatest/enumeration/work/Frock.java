package com.javatest.enumeration.work;

public class Frock {
    private static int cNum = 100000;

    private final int sNum;

    public Frock() {
        this.sNum = getNextNum();
    }

    public static int getNextNum() {
        return cNum += 100;
    }

    public int getsNum() {
        return sNum;
    }
}
