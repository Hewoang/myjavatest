package com.javatest.generic.test02;

import java.util.ArrayList;
import java.util.Comparator;

public class Test02 {
    public static void main(String[] args) {

        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("qwer", 2340, new Emp.MyDate(2002, 11, 4)));
        emps.add(new Emp("qwer", 2578, new Emp.MyDate(2007, 7, 22)));
        emps.add(new Emp("qwer", 2346, new Emp.MyDate(2004, 9, 30)));

        emps.sort(new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                int r = o1.getName().compareTo(o2.getName());
                if (r == 0){
                    return o1.getMyDate().compareTo(o2.getMyDate());
                }
                return r;
            }
        });

        for (Emp emp :emps) {
            System.out.println(emp);
        }

    }
}
