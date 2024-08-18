package com.javatest.Wrapper;


public class Wp_vs_String {
    public static void main(String[] args) {
        //包装类 -> String
        Integer n1 = 100;
        //三种方式
        String n2 = n1 + "";
        String n3 = n1.toString();
        String n4 = String.valueOf(n1);

        //String -> 包装类
        String m1 = "1234";
        //自动装箱
        Integer m2 = Integer.parseInt(m1);
        //构造器
        Integer m3 = new Integer(m1);
        m1.intern();

        A a = new A();
        a.ddd();
        System.out.println(a.s);

    }
}
class A{
    String s = new String("asdf");
    public void ddd(){
        s="fff";
        System.out.println(s);
    }
}