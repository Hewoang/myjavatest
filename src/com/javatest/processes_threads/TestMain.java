package com.javatest.processes_threads;

public class TestMain {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int i = runtime.availableProcessors();
        System.out.println(i);//当前有多少个cpu

    }
}