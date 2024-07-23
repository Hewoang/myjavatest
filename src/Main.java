import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!你好");
//        int[] arr={8,1,5,3,2,9,4,6,7};
//        A a = new A();
//        a.gg2(arr);
//
//        B b = new C();//向上
//        System.out.println(b.a);
//        b.gg();


    }

}
class A{
    int a;
    String b;


    public void gg(){

    }
    public void gg2(int[] a){
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                if(a[i] < a[j]){
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
class B{
    int a=10;
    public void gg(){
        System.out.println(1);
    }
}
class C extends B{
    int a=20;
    public void gg(){
        System.out.println(2);
    }
}