package com.javatest.enumeration.work_02;

public class Test {
    public static void main(String[] args) {
        new Animal(){
            @Override
            public void shout() {
                System.out.println("miao");
            }
        }.shout();

        new Animal(){
            @Override
            public void shout() {
                System.out.println("wang");
            }
        }.shout();
    }
}
