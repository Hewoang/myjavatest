package com.javatest.abstractTest;

public class CommonEmp extends Employee{
    public CommonEmp(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("Employee: "+ super.getName()+" is working");
    }
}
