package com.javatest.polypara;

public class Emp {
    private String name;
    private double ygz;

    public Emp(String name, int ygz) {
        this.name = name;
        this.ygz = ygz;
    }
    public String getAnnual() {
        return name+" "+ygz*12+"元/年";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYgz() {
        return ygz;
    }

    public void setYgz(double ygz) {
        this.ygz = ygz;
    }
}
