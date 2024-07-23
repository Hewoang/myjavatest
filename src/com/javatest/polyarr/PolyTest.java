package com.javatest.polyarr;

public class PolyTest {
    public static void main(String[] args) {

        Person[] people = new Person[5];
        people[0] = new Person("qwer", 23);
        people[1] = new Student("asdf", 22, 77);
        people[2] = new Student("zxcv", 20, 88);
        people[3] = new Teacher("tyui", 45, 2000);
        people[4] = new Teacher("ghjk", 49, 6999);

        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Student) {
                System.out.println(((Student) people[i]).study());
            } else if (people[i] instanceof Teacher) {
                System.out.println(((Teacher) people[i]).teach());
            } else {
                System.out.println(people[i].say());
            }
        }

    }
}
