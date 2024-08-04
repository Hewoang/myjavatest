package com.javatest.interfaceTest;

public class DB_02 implements DB{
    @Override
    public void connect() {
        System.out.println("DB_02.connect");
    }

    @Override
    public void close() {
        System.out.println("DB_02.close");
    }
}
