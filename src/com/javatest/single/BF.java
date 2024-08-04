package com.javatest.single;

// 步骤[单利模式-懒汉式]
// 1.将构造器私有化
// 2.在类的内部直接创建对象(该对象是static)
// 3.提供一个公共的static方法，返回gf对象
public class BF {
    private String name;
    public static int num = 45;
    private static BF bf;

    private BF(String name) {
        this.name = name;
    }

    public static BF getBF() {
        if (bf == null) bf= new BF("zxcv");
        return bf;
    }

    @Override
    public String toString() {
        return "GF{" +
                "name='" + name + '\'' +
                '}';
    }
}
