package com.javatest.collection.hashset.test02;

import java.util.HashSet;

public class Test02 {
    public static void main(String[] args) {
        MyDate md1 = new MyDate(2003, 5, 30);
        MyDate md2 = new MyDate(2002, 6, 1);
        MyDate md3 = new MyDate(2003, 12, 1);
        MyDate md4 = new MyDate(2003, 5, 30);

        HashSet hs = new HashSet();
        hs.add(new Employee("qwer", 24, md1));
        hs.add(new Employee("qwer", 26, md2));
        hs.add(new Employee("qwer", 25, md4));
        hs.add(new Employee("asdf", 24, md3));

        System.out.println(hs);
    }
}
