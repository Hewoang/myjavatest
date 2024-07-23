package com.javatest.polyarr;

public class Student extends Person {
    private double fenshu;

    public Student(String name, int age, double fenshu) {
        super(name, age);
        this.fenshu = fenshu;
    }

    @Override
    public String say() {
        return super.say() + "  " + fenshu + "分";
    }
    public String study() {
        return this.say()+"  1234";
    }
}
