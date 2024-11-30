package com.javatest.generic.work01;

import java.util.*;

public class Dao<T> {

    private Map<String, T> map = new HashMap<>();


    public void save(String id, T t) {
        map.put(id, t);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T newt) {
        map.put(id, newt);
    }

    public List<T> getAll() {
        List<T> list1 = new ArrayList<>();
//        list1.addAll(map.values());
        Set<String> a = map.keySet();
        for (String s :a) {
            list1.add(get(s));//上面的get()方法 ↑
        }

        return list1;
    }

    public void delete(String id) {
        map.remove(id);
    }
}
