package com.javatest.extend;

public class PC extends Computer {
    String brand;

    public PC(String CPU, String neicun, String yingpan, String brand) {
        super(CPU, neicun, yingpan);
        this.brand = brand;
    }

    public String getBrand() {
        return getDT() + " " + brand;
    }
    public  String getCPU() {
        return null;
    }
}
