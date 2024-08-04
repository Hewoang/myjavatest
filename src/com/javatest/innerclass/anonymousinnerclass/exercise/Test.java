package com.javatest.innerclass.anonymousinnerclass.exercise;

public class Test {
    public static void main(String[] args) {
        Cellphone cp = new Cellphone();
        cp.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床了。。。。");
            }
        });
        cp.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了。。。。");
            }
        });
    }
}
