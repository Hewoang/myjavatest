package com.javatest.interfaceTest;

public class DB_01 implements DB{
    @Override
    public void connect() {
        System.out.println("DB_01.connect");
    }

    @Override
    public void close() {
        System.out.println("DB_01.close");
    }
}
