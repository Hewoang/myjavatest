package com.javatest.smallchange;

import java.util.Scanner;

public class MingXi {

    double balance;

    Scanner sc = new Scanner(System.in);

    public void menu() {

        System.out.println("===========XXX============");
        boolean a = true;
        do {
            switch (sc.nextLine()) {
                case "1":
                    this.mx();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    a= this.exit();
                    break;
            }

        } while (a);
    }

    public void mx() {
        System.out.println();
    }

    public void income() {
        double q = sc.nextDouble();
        double[] arr = {};

    }

    public void pay() {

    }

    public boolean exit() {
        return false;
    }

}
