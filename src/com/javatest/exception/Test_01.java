package com.javatest.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a="";
        int b=0;
        while (true){
            System.out.println("enter a number");
            a=sc.next();
            try {
                b=Integer.parseInt(a);
                break;
            } catch (Exception e) {
                System.out.println("error");
            }
        }
        System.out.println(a);
    }
}
