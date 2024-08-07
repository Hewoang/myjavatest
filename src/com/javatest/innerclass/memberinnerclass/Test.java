package com.javatest.innerclass.memberinnerclass;

public class Test {
    public static void main(String[] args) {
        MIC mic = new MIC();
        mic.rrr();

        //外部其他类，使用成员内部类的三种方式
        //1.
        MIC.Inner inner = mic.new Inner();
        inner.jjk();

        //2. 返回Inner实例
        MIC.Inner inner1 = mic.getInner();
        inner1.jjk();
    }
}
