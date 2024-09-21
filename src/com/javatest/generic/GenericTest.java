package com.javatest.generic;

public class GenericTest {
    public static void main(String[] args) {

        A<String, Integer> a = new A<String, Integer>("qwe",23);

    }
}
class A<E,R>{
    private E a;
    private R b;

    public A(E a, R b) {
        this.a = a;
        this.b = b;
    }
}

