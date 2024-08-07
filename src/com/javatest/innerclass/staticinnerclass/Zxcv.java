package com.javatest.innerclass.staticinnerclass;

public class Zxcv {
    private static int a=66;

    //可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员
    public static class RR{
        public void print(){
            System.out.println(a);
        }
    }
    public RR getRR(){
        return new RR();
    }
}
