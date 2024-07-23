package com.javatest.encap;

public class Account {
    private String name;
    private double yue;
    private String password;

//    public Account() {
//    }
//
//    public Account(String name, double yue, String password) {
//        this.setName(name);
//        ...
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("error");
        }
    }

    public double getYue() {
        return yue;
    }

    public void setYue(double yue) {
        if (yue > 20) {
            this.yue = yue;
        } else {
            System.out.println("error");
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("error");
        }
    }
}
