package com.javatest.enumeration;

public class Test {
    public static void main(String[] args) {
//        System.out.println(Season.SPRING);
//        System.out.println(Season.WINTER);
//        System.out.println(Season.AUTUMN);
//        System.out.println(Season.SUMMER);

//        Season[] values = Season.values();
        //增强for循环
        //执行流程是 依次从values数组中取出数据，赋给i，如果取出完毕，则退出for
//        for (Season i : values) {
//            System.out.println(i);
//        }

        //根据你输入的"值"到 Season 的枚举对象去查找
//        System.out.println(Season.valueOf("SPRING"));

        Week[] wk = Week.values();
        System.out.println("===========");
        for (Week week : wk) {
            System.out.println(week);
        }


//        Week[] wk = Week.values();
//        System.out.println("===========");
//        for (Week week : wk) {
//            switch (week.getOL()) {
//                case 0:
//                    System.out.println("星期一");
//                    break;
//                case 1:
//                    System.out.println("星期二");
//                    break;
//                case 2:
//                    System.out.println("星期三");
//                    break;
//                case 3:
//                    System.out.println("星期四");
//                    break;
//                case 4:
//                    System.out.println("星期五");
//                    break;
//                case 5:
//                    System.out.println("星期六");
//                    break;
//                case 6:
//                    System.out.println("星期日");
//                    break;
//            }
//        }
    }
}
