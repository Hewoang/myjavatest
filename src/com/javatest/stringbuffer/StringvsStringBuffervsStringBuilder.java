package com.javatest.stringbuffer;

public class StringvsStringBuffervsStringBuilder {
    public static void main(String[] args) {

        long startTime = 0;
        long endTime = 0;
        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            stringBuilder.append(i);//拼接字符串
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime));

        //StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            stringBuffer.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime));

        //String
        String a="";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            a = a + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime));

/**
 *
 * 使用的原则，结论:
 * 1. 如果字符串存在大量的修改操作，一般使用 StringBuffer 或 StringBuilder
 * 2. 如果字符串存在大量的修改操作，并在单线程的情况,使用 StringBuilder
 * 3. 如果字符串存在大量的修改操作，并在多线程的情况,使用 StringBuffer
 * 4. 如果我们字符串很少修改，被多个对象引用，使用String,比如配置信息等
 *
**/
    }
}
