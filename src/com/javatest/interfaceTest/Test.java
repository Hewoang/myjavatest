package com.javatest.interfaceTest;

public class Test {
    public static void main(String[] args) {
        //(1)
        AA[] aa = new AA[2];
        aa[0] = new Qwer();
        aa[1] = new Zxcv();

        for (int i = 0; i < aa.length; i++) {
            aa[i].fff();
            if (aa[i] instanceof Qwer) {
                ((Qwer) aa[i]).ggg();
            }
        }

        //(2)
        TestDB testDB = new TestDB();
        DB_01 db01 = new DB_01();
        DB_02 db02 = new DB_02();

        testDB.f(db01);
        testDB.f(db02);
    }
}
class TestDB{
    public void f(DB db){
        db.connect();
        db.close();
    }
}