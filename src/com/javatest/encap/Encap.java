package com.javatest.encap;

public class Encap {
    public static void main(String[] args) {

        Person person = new Person();

        person.setName("asdf");
        person.setAge(14);
        person.setGz(3000);

        System.out.println(person.in());
    }
}
class Person{
    public String name;
    private int age;
    private int gz;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGz() {
        return gz;
    }

    public void setGz(int gz) {
        this.gz = gz;
    }

    public String in() {
        return name+","+age+","+gz;
    }
}