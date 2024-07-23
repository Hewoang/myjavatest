package com.javatest.polypara;

public class Person extends Emp{

    public Person(String name, int ygz) {
        super(name, ygz);
    }

    @Override
    public String getAnnual() {
        return super.getAnnual();
    }
    public String work(){
        return "工作";
    }
}
