package com.javatest.arrays;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ArraysTest {
    public static void main(String[] args) {
        long startTime = 0;
        long endTime = 0;
        Integer[] arr = {2,5,3,4,7,1,8,0,9,6};
        int[] arr2 = new int[20000];
        Integer[] arr3 = new Integer[20000];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=new Random().nextInt(30000);
            arr3[i]=new Random().nextInt(30000);
        }

        startTime = System.currentTimeMillis();
        Arrays.sort(arr3, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer)o1;
                int i2 = (Integer)o2;
                return i1 - i2;
            }
        });
        endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

        // ↓ 根本就不是冒泡！！！
        startTime = System.currentTimeMillis();
        int s=0;
        for (int h = 0; h < arr2.length; h++) {
            for (int h2 = 0; h2 < arr2.length; h2++) {
                if (arr2[h] < arr2[h2]) {
                    s=arr2[h];
                    arr2[h]=arr2[h2];
                    arr2[h2]=s;
                }
            }
        }
        endTime = System.currentTimeMillis();
//        System.out.println(Arrays.toString(arr2));
        System.out.println(endTime-startTime);

        // ↓ 正确的冒泡
//        for (int k = 0; k < arr.length-1; k++) {
//            for (int v = 0; v < arr.length-1-k; v++) {
//                if (arr[v] > arr[v+1]) {
//                    int temp = arr[v];
//                    arr[v] = arr[v+1];
//                    arr[v+1] = temp;
//                }
//            }
//        }

//        startTime = System.currentTimeMillis();
//        Arrays.sort(arr3);
//        endTime = System.currentTimeMillis();
//        System.out.println(endTime-startTime);
    }
}
