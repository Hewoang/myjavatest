package com.javatest.extend;

public class NotePad extends Computer {
    String color;

    public NotePad(String CPU, String neicun, String yingpan, String color) {
        super(CPU, neicun, yingpan);
        this.color = color;
    }

    public String getNotepad() {
        return getDT() + " " + color;
    }
}
