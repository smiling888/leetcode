package com.lzh.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2021-08-19
 */
public class L290wordPattern {

    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap();

        String[] arr = s.split(" ");
        if (arr.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(new Character(c))) {
                if (!map.get(c).equals(arr[i])) {
                    return false;
                }

            } else {
                //出错地方
                if (map.values().contains(arr[i])) {
                    return false;
                }
                map.put(c, arr[i]);
            }
        }

        return true;
    }


    public static void main(String[] args) {
        //        new L290wordPattern().wordPattern("abba","dog dog dog dog");

        Map<Long, String> map = new HashMap<>();
        map.put(1L, "aa");
        map.put(1000L, "aa");
        Integer a = 1;

        System.out.println(map.get(a));
    }

}
