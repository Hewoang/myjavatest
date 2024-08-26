package com.javatest.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Book("qwer","rrr"));
        list.add(new Book("asdf","ttt"));
        list.add(new Book("zxcv","yyy"));

        //得到 list 对应的迭代器(iterator)
        Iterator it = list.iterator();
        //循环遍历
        //hasNext()判断集合中有没有下一个元素，返回布尔值
        while (it.hasNext()) {//快捷键itit
            //返回下一个元素，Object类型
            Object obj = it.next();
            System.out.println(obj);
        }
        //当退出while循环后，这时iterator迭代器，
        // 指向最后的元素iterator.next();NoSuchElementException
        //如果希望再次遍历，需要重置我们的迭代器
        //it=list.iterator();

        //增强for循环
        for (Object obj : list){//快捷键 I
            System.out.println(obj);
        }

        //普通for循环  List接口类型才可以用 get()
//        List a = (List) list;
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(a.get(i));
//        }
    }
}
