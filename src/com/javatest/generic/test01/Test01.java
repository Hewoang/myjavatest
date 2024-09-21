package com.javatest.generic.test01;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();
        students.add(new Student("qwer",20));
        students.add(new Student("asdf",21));
        students.add(new Student("zxcv",19));

        for (Student stu :students) {
            System.out.println(stu.getName()+"--"+stu.getAge());
        }

        HashMap<String, Student> map = new HashMap<>();
        map.put("qwer",new Student("qwer",20));
        map.put("asdf",new Student("asdf",21));
        map.put("zxcv",new Student("zxcv",19));

        Set<Map.Entry<String, Student>> entries = map.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next);
        }
    }
}
