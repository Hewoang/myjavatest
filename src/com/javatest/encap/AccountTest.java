package com.javatest.encap;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account();
        a.setName("asdf");
        a.setYue(200);
        a.setPassword("123456");
        String s = new Scanner(System.in).nextLine();
        if (s.equals(a.getPassword())) {
            System.out.println(a.getName() + " " + a.getYue());
        } else {
            System.out.println("Wrong password");
        }

    }

}
