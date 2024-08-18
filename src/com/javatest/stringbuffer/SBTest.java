package com.javatest.stringbuffer;

import java.util.Scanner;

public class SBTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        //找到最后的“.”的索引
        int i = sb.lastIndexOf(".");
        for (int j = i - 3; j > 0; j -= 3) {
            //在字符串中的 j 位置(索引) 加 ","
            sb = sb.insert(j, ",");
        }
        System.out.println(sb);
    }
}
