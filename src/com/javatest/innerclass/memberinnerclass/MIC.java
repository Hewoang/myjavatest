package com.javatest.innerclass.memberinnerclass;

public class MIC {
    private int a=10;

    public int ggb(){
        return a+5;
    }

    public class Inner{//成员内部类
        private int a=20;
        public void jjk(){
            System.out.println(a+" "+ggb()+" "+MIC.this.a);
        }
    }

    public void rrr() {
        new Inner().jjk();
    }

    public Inner getInner(){
        return new Inner();
    }
}
