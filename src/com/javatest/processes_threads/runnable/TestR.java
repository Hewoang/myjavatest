package com.javatest.processes_threads.runnable;

public class TestR {
    public static void main(String[] args) {

        RunnableTest rt = new RunnableTest();
        //代理模式
        Thread t1 = new Thread(rt);
        t1.start();

    }
}
//代理模式 代码实现
//(代理类)
/*
    class AA_Proxy implements Runnable {

        private Runnable target = null;

        public AA_Proxy(Runnable target) {
            this.target = target;
        }

        @Override
        public void run() {
            if (target != null) {
                target.run();
            }
        }

        public void start() {
            start0();//实现多线程方法
        }

        public void start0() {
            run();
        }
    }
 */