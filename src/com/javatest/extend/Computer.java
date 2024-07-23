package com.javatest.extend;

public class Computer {
    private String CPU;
    private String neicun;
    private String yingpan;

    public Computer(String CPU, String neicun, String yingpan) {
        this.CPU = CPU;
        this.neicun = neicun;
        this.yingpan = yingpan;
    }

    public String getDT() {
        return CPU + " " + neicun + " " + yingpan;
    }
    public String getCPU() {
        return null;
    }
}
