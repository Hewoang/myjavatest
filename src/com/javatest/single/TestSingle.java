package com.javatest.single;

public class TestSingle {
    public static void main(String[] args) {
        // [单利模式-饿汉式]
        System.out.println(GF.getGF());

        // [单利模式-懒汉式]
        System.out.println(BF.getBF());
    }
}