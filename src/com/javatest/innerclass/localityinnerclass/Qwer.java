package com.javatest.innerclass.localityinnerclass;

public class Qwer {//外部类

    private int a=12;

    public String ccc(){
        return "ccc";
    }

    public void foo() {
        class inner{
            public void bar() {
                System.out.println("inner bar");
                //可访问外部类的属性和方法
                System.out.println(ccc()+"  "+Qwer.this.a);
            }
        }
        new inner().bar();
    }
}
