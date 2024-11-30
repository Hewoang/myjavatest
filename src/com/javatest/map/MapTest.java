package com.javatest.map;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");

        map.remove("key4");//删
        System.out.println(map.get("key1"));//查
        System.out.println(map.size());//元素个数
        System.out.println(map.isEmpty());//判断个数是否为0
//        map.clear();//清除k-v
        System.out.println(map.containsKey("key2"));//查找键是否存在

//        System.out.println(map);
        Set entryset = map.entrySet();
        System.out.println(entryset);//所有的key-value
        Set keyset = map.keySet();
        System.out.println(keyset);//所有的key
        Collection values = map.values();
        System.out.println(values);//所有的value


        //遍历
         //keyset
        for (Object o :keyset) {
            System.out.println(o+":"+map.get(o));
        }
//        Iterator iterator = keyset.iterator();
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            System.out.println(next);
//        }

        //value
        for (Object v :values) {
            System.out.println(v);//不可反向取key
        }
//        Iterator iterator = values.iterator();
//        while (iterator.hasNext()) {
//            Object v =  iterator.next();
//            System.out.println(v);
//        }

        //entryset
        for (Object e :entryset) {// EntrySet<Map.Entry<k,v>>
            //将 e 转成 Map.Entry
            Map.Entry mE = (Map.Entry) e;
            System.out.println(mE.getKey()+" - "+mE.getValue());
        }

//        Iterator iterator1 = entryset.iterator();
//        while (iterator1.hasNext()) {
//            Object e = iterator1.next();
//            //System.out.println(e);
//            Map.Entry mE = (Map.Entry) e;
//            System.out.println(mE.getKey()+" - "+mE.getValue());
//        }
    }
}
