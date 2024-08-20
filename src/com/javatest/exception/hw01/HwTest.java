package com.javatest.exception.hw01;

import java.util.Scanner;

public class HwTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String username = sc.nextLine();
            String password = sc.nextLine();
            String email = sc.nextLine();
            register(username, password, email);

            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void register(String username, String password, String email) throws Exception {
        if (username == "" && password == "" && email == "") {

        }

        if (!(username.length() >= 2 && username.length() <= 4)) {
            throw new RuntimeException("用户名error");
        }

        if (!(password.length() == 6 && isDigital(password))) {
            throw new RuntimeException("密码error");
        }

        //在字符串或数组中查找特定元素或子字符串的首次出现位置，并返回其索引
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱error");
        }
    }

    public static boolean isDigital(String pw) {
        char[] ca = pw.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            if (!(ca[i] >= '0' && ca[i] <= '9')) {
                return false;
            }
        }
        return true;
    }
}
