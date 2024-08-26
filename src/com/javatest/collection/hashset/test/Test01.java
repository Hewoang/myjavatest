package com.javatest.collection.hashset.test;

import java.util.HashSet;

public class Test01 {
    public static void main(String[] args) {

        HashSet hs = new HashSet();
        hs.add(new Employee("qwer",24));
        hs.add(new Employee("asdf",23));
        hs.add(new Employee("qwer",25));
        hs.add(new Employee("qwer",25));
        hs.add(new Employee("zxcv",25));

        System.out.println(hs);
    }
}
