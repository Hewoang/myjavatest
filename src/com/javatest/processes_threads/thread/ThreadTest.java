package com.javatest.processes_threads.thread;

public class ThreadTest extends Thread {

    int count = 0;
    @Override
    public void run() {

        while (true) {
            System.out.println("Hello World  " + Thread.currentThread().getName());//线程名字
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (count == 10) {
                break;
            }

        }
    }
}
