package com.javatest.enumeration.work_06;

public class Car {
    private double temp;

    public Car(double temp) {
        this.temp = temp;
    }

    class Air {

        public void flow() {
            if (temp > 40) {
                System.out.println("cold");
            } else if (temp < 0) {
                System.out.println("hot");
            } else {
                System.out.println("close");
            }
        }
    }
    public Air getAir() {
        return new Air();
    }
}
