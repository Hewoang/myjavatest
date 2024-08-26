package com.javatest.stringbuffer.hw02;

import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        ttt(s);

    }
    public static void ttt(String str){
        int a=0,b=0,c=0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a'&&chars[i] <= 'z') {
                a++;
            }
            if (chars[i] >= 'A'&&chars[i] <= 'Z') {
                b++;
            }
            if (chars[i] >= '0'&&chars[i] <= '9') {
                c++;
            }
        }
        System.out.println("小写"+a+"  大写"+b+"  数字"+c);
    }
}
