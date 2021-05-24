package com.lzh;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author jiuxing.lzh
 * Date: 2021/4/30
 **/
public class HashTreeMapDemo {
    public static void main(String[] args) {


        TreeMap<String, Integer> treeMap = new TreeMap<>();
        put(treeMap);
        //按照key排序
        treeMap.entrySet().stream().forEach(it ->
                System.out.println(it.getKey() + ":" + it.getValue())
        );

        //按照value排序
        treeMap = new TreeMap<String, Integer>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        put(treeMap);
        treeMap.entrySet().stream().forEach(it ->
                System.out.println(it.getKey() + ":" + it.getValue())
        );

    }

    public static void put(TreeMap<String, Integer> treeMap) {
        treeMap.put("abc", 1);
        treeMap.put("ddd", 3);
        treeMap.put("aaa", 2);
    }
}
