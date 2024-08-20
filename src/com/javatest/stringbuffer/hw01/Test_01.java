package com.javatest.stringbuffer.hw01;

public class Test_01 {
    public static void main(String[] args) {
        String str = "asdfgh";
        try {
            str = reverse(str, 1, 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(str);

    }

    public static String reverse(String str, int start, int end) {

        if (!(str != null && start > 0 && end > start && end < str.length())) {
            throw new RuntimeException("error");
        }

        char[] chars = str.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if ((start + i) == (end - i)) break;
//            char t = chars[start + i];
//            chars[start + i] = chars[end - i];
//            chars[end - i] = t;
//            if ((end - i) - (start + i) == 1) break;
//        }
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return String.valueOf(chars);
    }
}
