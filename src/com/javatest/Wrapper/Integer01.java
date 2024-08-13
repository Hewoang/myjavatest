package com.javatest.Wrapper;

public class Integer01 {

    public static void main(String[] args) {
        //手动装箱
        int i = 10;
        Integer i1 = new Integer(i);
        Integer i2 = Integer.valueOf(i);
        //手动拆箱
        int n = i1.intValue();


        int m = 9;
        //自动装箱
        Integer n1 = m;
        //自动拆箱
        int g = n1;

        //三元（一个整体）  自动提升精度double
        Object o1 = true ? new Integer(1) : new Double(3.0);
        System.out.println(o1);//输出1.0
    }

}
