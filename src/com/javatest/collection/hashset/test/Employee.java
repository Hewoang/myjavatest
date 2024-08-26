package com.javatest.collection.hashset.test;


import java.util.Objects;

public class Employee {

    static final int HASH_CODE = 100;

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //    @Override
//    public int hashCode() {
//        return HASH_CODE;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this.name==((Employee)o).name && this.age==((Employee)o).age) {
//            return true;
//        }
//        return false;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
