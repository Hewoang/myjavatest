package com.javatest.map.test01;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {

//        HashMap hm = new HashMap();
//        hm.put("1",new Emp("qwer",1,20900));
//        hm.put("2",new Emp("asdf",2,3000));
//        hm.put("3",new Emp("zxcv",3,2500));
//        hm.put("4",new Emp("ghjk",4,23450));
//        hm.put("5",new Emp("ssss",5,23450));
//        hm.put("6",new Emp("gggg",6,2345));
//        hm.put("7",new Emp("uuuu",7,19878));

//        Collection values = hm.values();
//        for (Object va :values) {
//            Emp emp = (Emp) va;
//            if (emp.getSalary()>18000)
//                System.out.println(emp);
//        }

//        Set set = hm.entrySet();
//        for (Object va :set) {
//            Map.Entry e = (Map.Entry) va;
//            Emp value = (Emp) e.getValue();
//            if (value.getSalary()>18000)
//                System.out.println(value);

        TreeMap tm = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
            }
        });
        tm.put("ayute","value");
        tm.put("sdaf","value");
        tm.put("ztrafr","value");
        tm.put("qwer","value");

        System.out.println(tm);
    }
}