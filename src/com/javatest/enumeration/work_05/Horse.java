package com.javatest.enumeration.work_05;

public class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("Horse works");
    }

    private Horse(){
    }

    private static Horse ma = new Horse();

    public static Horse getMa(){
        return ma;
    }
}
