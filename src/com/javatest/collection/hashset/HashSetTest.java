package com.javatest.collection.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        //数据不可重复
        HashSet hs = new HashSet();
//        hs.add("qwer");
//        hs.add("asdf");
//        hs.add("qwer");

        for (int i = 0; i < 10; i++) {
            hs.add(new A(i));
        }
        System.out.println(hs);
    }
}
class A{
    private int a;

    public A(int a) {
        this.a = a;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}