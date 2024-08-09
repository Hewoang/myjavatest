package com.javatest.enumeration.work_05;

public class Factory {

    private Factory(){
    }

    public static Horse hhh(){
        return Horse.getMa();
    }
    public static Boat bbb(){
        return new Boat();
    }
}
