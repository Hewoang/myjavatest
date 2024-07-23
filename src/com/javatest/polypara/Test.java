package com.javatest.polypara;

public class Test {
    public static void main(String[] args) {
        Emp[] emps = new Emp[4];
        emps[0] = new Person("qwer",3000);
        emps[1] = new Person("asdf",3560);
        emps[2] = new Manager("zxcv",6000,1000);
        emps[3] = new Manager("vbnm",5784,1000);

        Test test = new Test();
        test.sEA(emps);

        test.testw(emps);

//        A a = new A("qw",22);
//        A a1 = new A("qw",22);
//        System.out.println(a.equals(a1));
//        System.out.println(a);
//        System.out.println(emps[1].equals(emps[2]));
    }
    public void sEA(Emp[] emps){
        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i].getAnnual());
        }
    }
    public void testw(Emp[] emps){
        for (int i = 0; i < emps.length; i++) {
            if (emps[i] instanceof Person){
                System.out.println(((Person) emps[i]).work());
            }else if (emps[i] instanceof Manager){
                System.out.println(((Manager) emps[i]).manage());
            }else {
                System.out.println("error");
            }
        }
    }
}
class A{
    private String name;
    private int age;

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof A){
            A a = (A) obj;
            return this.name.equals(a.name) && this.age == a.age;
        }
        return false;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}