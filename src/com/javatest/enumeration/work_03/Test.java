package com.javatest.enumeration.work_03;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Cellphone cp = new Cellphone();

        System.out.print("num1: ");
        int s = new Scanner(System.in).nextInt();
        System.out.print("num2: ");
        int b = new Scanner(System.in).nextInt();

        //匿名内部类作为参数传递
        cp.testWork(new Calculator(){
            @Override
            public void work(int s,int b) {
                System.out.println(s+"+"+b+"= "+(s+b));
            }
        },s,b);
    }
}
