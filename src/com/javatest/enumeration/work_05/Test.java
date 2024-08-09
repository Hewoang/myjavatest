package com.javatest.enumeration.work_05;

import com.javatest.houserent.domain.House;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("唐僧",Horse.getMa());
        person.passRiver();
        person.common();

    }
}
