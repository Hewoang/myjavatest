package com.javatest.collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Vector 线程安全 多线程

public class ListTest {
    public static void main(String[] args) {

//        List list = new ArrayList();
//        for (int i = 0; i < 10; i++) {
//            list.add("hello " + (i+1));
//        }
//
//        list.add(1,"插入~");
//        System.out.println(list.get(4));
//        list.remove(6);
//        list.set(6,"修改~");
//
//        Iterator it = list.iterator();
//        while (it.hasNext()) {
//            Object next =  it.next();
//            System.out.println(next);
//        }

        List list1 = new ArrayList();
//        list1.add("a");
        list1.add(new Book("西游记", "wu", 60));
        list1.add(new Book("红楼梦", "cao", 70));
        list1.add(new Book("三国演义", "luo", 65));
        list1.add(new Book("水浒传", "shi", 80));

        for (int i = 0; i < list1.size() - 1; i++) {
            for (int j = i + 1; j < list1.size() - 1 - i; j++) {
                Book b1 = (Book) list1.get(j);
                Book b2 = (Book) list1.get(j + 1);
                if (b1.getPrice() > b2.getPrice()) {
                    list1.set(j, b2);
                    list1.set(j + 1, b1);
                }
            }
        }
        for (Object o :list1) {
            System.out.println(o);
        }


    }
}
