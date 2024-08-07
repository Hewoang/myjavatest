package com.javatest.enumeration;

@SuppressWarnings("all")
//enum关键字
//默认继承enum
public enum Season {

    //public static final Season SPRING = new Season("春天",1);
    //如果使用enum来实现枚举，要求将定义常量对象，写在前面
    //用逗号间隔
    SPRING("春天",1),
    WINTER("冬天",2),
    AUTUMN("秋天",3),
    SUMMER("夏天",4);

    private String name;
    private int num;

    private Season(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
