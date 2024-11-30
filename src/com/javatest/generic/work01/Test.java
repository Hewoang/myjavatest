package com.javatest.generic.work01;

import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Dao<User> uDao = new Dao<>();

        uDao.save("01",new User(1,"qwer",21));
        uDao.save("02",new User(2,"zxcv",24));


//        uDao.update("01",new User(2,"asdf",32));
//        System.out.println(uDao.get("01"));

        List<User> all = uDao.getAll();
        System.out.println(all);

    }
}
