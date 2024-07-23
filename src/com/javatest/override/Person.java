package com.javatest.override;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String say(){
        return "Hello im " + name + " " + age;
    }
}
