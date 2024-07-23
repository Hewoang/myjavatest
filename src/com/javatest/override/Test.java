package com.javatest.override;

public class Test {
    public static void main(String[] args) {
//        Person qwer =
        Person per = new Student("qwer", 18,1234,56);
        Student stu =(Student) per;
//        System.out.println(qwer.say());
//        System.out.println(asdf.say());

        stu.getId();
//        new Student("asdf", 20, 2345, 60);
    }
}
