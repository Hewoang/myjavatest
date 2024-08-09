package com.javatest.enumeration.work_05;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {

        // vehicles instanceof Boat ===> false
        //     null instanceof Boat ===> false
        if (!(vehicles instanceof Boat)) {
            vehicles = Factory.bbb();
        }
        vehicles.work();
    }

    public void common() {

        if (!(vehicles instanceof Horse)) {
            vehicles = Factory.hhh();
        }
        vehicles.work();
    }

}
