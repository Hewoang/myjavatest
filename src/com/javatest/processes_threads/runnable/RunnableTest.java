package com.javatest.processes_threads.runnable;

public class RunnableTest implements Runnable {
    @Override
    public void run() {

        int count = 0;
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
