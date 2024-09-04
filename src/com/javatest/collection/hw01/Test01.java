package com.javatest.collection.hw01;

import java.util.ArrayList;
import java.util.Collections;

public class Test01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new News("新冠确诊病例超干万，数百万印度教信徒赴恒河“圣浴”引民众担忧"));
        list.add(new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生"));

        Collections.reverse(list);

        for (Object o :list) {
            System.out.println(NewsT(((News)o).getTitle()));
        }
    }
    private static String NewsT(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() > 15) {
            return s.substring(0,15)+"...";
        }
        return s;
    }
}
