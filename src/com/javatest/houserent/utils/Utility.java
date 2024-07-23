package com.javatest.houserent.utils;

import java.util.Scanner;

public class Utility {

    private static Scanner sc = new Scanner(System.in);

    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = keyB(1, false);//包含一个字符的字符串
            c = str.charAt(0);//将字符串转换成字符char类型
            if (c != '1' && c != '2' &&
                    c != '3' && c != '4' && c != '5' && c != '6') {
                System.out.print("选择错误，请重新输入：");
            } else break;
        }
        return c;
    }

    public static char readChar() {
        String str = keyB(1,false);
        return str.charAt(0);
    }
    public static String readString(int lim) {
        return keyB(lim,false);
    }
    public static int readInt() {
        int n;
        for (; ; ) {
            String str = keyB(10, true);
            if (str.equals("")) {
                System.out.println("bu neng wei kong!!");
            }

            //异常处理...
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    public static boolean readBoo() {
        int n;
        String a = keyB(1,false);
        n=Integer.parseInt(a);
        return n != 0;
    }

    public static String keyB(int lim, boolean a) {
        String line = "";

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (line.length() == 0) {
                if (a) return line;
                else continue;
            }
            if (line.length() <1 || line.length()>lim) {
                System.out.println("error");
                continue;
            }
            break;
        }
        return line;
    }
}
