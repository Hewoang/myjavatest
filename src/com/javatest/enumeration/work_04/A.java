package com.javatest.enumeration.work_04;

public class A {

    private final String NAME="qwer";

    public void fff() {
        class B {
            private final String NAME="zxcv";

            public void print() {
                System.out.println(NAME+" "+A.this.NAME);
            }
        }
        new B().print();
    }



}
class Test{
    public static void main(String[] args) {

        new A().fff();
    }
}