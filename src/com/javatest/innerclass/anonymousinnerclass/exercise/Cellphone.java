package com.javatest.innerclass.anonymousinnerclass.exercise;

public class Cellphone {
    public void alarmclock(Bell bell){
        System.out.println(bell.getClass());
        bell.ring();
    }
}
