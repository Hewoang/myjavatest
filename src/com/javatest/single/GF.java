package com.javatest.single;

//如何保障我们只能创建一个 GirlFriend 对象
// 步骤[单利模式-饿汉式]
// 1.将构造器私有化
// 2.在类的内部直接创建对象(该对象是static)
// 3.提供一个公共的static方法，返回gf对象
public class GF {

    private String name;

    private GF(String name) {
        this.name = name;
    }
    private static GF gf = new GF("asdf");

    public static GF getGF() {
        return gf;
    }

    @Override
    public String toString() {
        return "GF{" +
                "name='" + name + '\'' +
                '}';
    }
}
