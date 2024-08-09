package com.javatest.enumeration.work_06;

public class Test {
    public static void main(String[] args) {

//        Car.Air air1 = new Car(45).new Air();
        Car car1 = new Car(45);
        car1.getAir().flow();
        Car car2 = new Car(23);
        car2.getAir().flow();
        Car car3 = new Car(-5);
        car3.getAir().flow();
    }
}
