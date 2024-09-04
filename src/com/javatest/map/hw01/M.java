package com.javatest.map.hw01;

public class M {
    private String n;
    private int s;

    public M(String n, int s) {
        this.n = n;
        this.s = s;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "M{" +
                "name='" + n + '\'' +
                ", salary=" + s +
                '}';
    }
}
