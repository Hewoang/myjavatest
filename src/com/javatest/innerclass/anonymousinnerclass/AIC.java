package com.javatest.innerclass.anonymousinnerclass;

public class AIC {
    private int n1=99;

//作用域 方法内
    public void f1(){
        //匿名内部类
        //编译类型TestPer 运行类型AIC$1(外部类$1)
        //继承TestPer的子类 AIC$1
        TestPer tp = new TestPer(){
            @Override
            public void print() {
                System.out.println("qwerqwer");
            }
        };
        tp.print();

        new TestPer(){
            @Override
            public void print() {
                System.out.println("=======");
                System.out.println("ggggggg "+AIC.this.n1);
            }
        }.print();

        //接口
        new AA(){
            @Override
            public void qwer() {
                System.out.println("asdf");
            }
        }.qwer();
    }
}
class TestPer{
    public void print(){
    }
}
interface AA{
    void qwer();
}