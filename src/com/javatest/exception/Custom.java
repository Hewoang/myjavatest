package com.javatest.exception;

import java.util.Scanner;

public class Custom {
    public static void main(String[] args) {

        int age=new Scanner(System.in).nextInt();
        if (!(age >=18 && age<=120)) {
            throw new AgeException("18~120");
        }
    }
}

//一般继承RuntimeException
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}