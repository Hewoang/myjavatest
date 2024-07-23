package com.javatest.polyarr;

public class Teacher extends Person {
    private double qian;

    public Teacher(String name, int age, double qian) {
        super(name, age);
        this.qian = qian;
    }

    @Override
    public String say() {
        return super.say() + "  " + qian + "元";
    }
    public String teach() {
        return this.say()+" 555";
    }
}
