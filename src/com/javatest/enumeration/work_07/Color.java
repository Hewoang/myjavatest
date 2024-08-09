package com.javatest.enumeration.work_07;

public enum Color implements A{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    GREEN(0,255,0),
    YELLOW(255,255,0),;

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println(getRedValue()+","+getGreenValue()+","+getBlueValue());
    }

    public int getRedValue() {
        return redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }
}
