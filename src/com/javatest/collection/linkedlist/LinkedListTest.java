package com.javatest.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        Node qwer = new Node("qwer");
        Node asdf = new Node("asdf");
        Node zxcv = new Node("zxcv");

        qwer.setNext(asdf);
        asdf.setNext(zxcv);

        zxcv.setPrev(asdf);
        asdf.setPrev(qwer);

        Node first = qwer;
        Node last = zxcv;

        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.getNext();
        }
        System.out.println("=============");
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.getPrev();
        }

        //LinkedList() CRUD
        LinkedList linkedList = new LinkedList();
        linkedList.add(qwer);
        linkedList.add(asdf);
        linkedList.remove();//删第一个
        linkedList.set(0,zxcv);
        linkedList.get(0);
    }
}
class Node{
    private Object item;
    private Node next;
    private Node prev;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "item=" + item ;
    }
}