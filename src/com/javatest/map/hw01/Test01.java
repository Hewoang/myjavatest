package com.javatest.map.hw01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        Map hm = new HashMap();
        hm.put("1", new M("jack", 650));
        hm.put("2", new M("tom", 1200));
        hm.put("3", new M("smith", 2900));

        Collection values = hm.values();

        for (Object o : values) {
            M m = (M) o;
            if (m.getN().equals("jack")) {
                m.setS(2600);
            }
            m.setS(m.getS() + 100);
            System.out.println(m);
        }

        Map hashMap = new HashMap();
        hashMap.put("qwer", 1234);
        hashMap.put("asdf", 2345);
        hashMap.put("zxcv", 3456);

        hashMap.put("qwer", 9876);//更新

        Set set = hashMap.keySet();
        for (Object o : set) {
            hashMap.put(o, (Integer) hashMap.get(o) + 100);
            System.out.println(o + "-" + hashMap.get(o));
        }
    }
}
