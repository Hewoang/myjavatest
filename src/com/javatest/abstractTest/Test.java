package com.javatest.abstractTest;

public class Test {
    public static void main(String[] args) {
//        Manager manager = new Manager("qwer",01,2000,300);
//        manager.work();
//        CommonEmp emp = new CommonEmp("asdf",02,500);
//        emp.work();
        TestTime test = new TestTime();
        test.xxx();

    }
}
class TestTime{
    public void xxx(){
        long l = System.currentTimeMillis();
        long n=0;
        for (int i = 1; i < 100000000; i++) {
            n+=1;
        }
        long l1 = System.currentTimeMillis();
        System.out.println("times: "+(l1-l)+" ms");
    }
}
