package com.javatest.stringbuffer.hw02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        pName(s);
    }
    public static void pName(String str){
        String[] s = str.split(" ");
        if(s.length == 2){
            String f1 = String.format("%s .%c", s[1], s[0].toUpperCase().charAt(0));
            System.out.println(f1);
        }
        if(s.length == 3){
            String f1 = String.format("%s,%s .%c", s[1],s[2],s[0].toUpperCase().charAt(0));
            System.out.println(f1);
        }
    }
}
