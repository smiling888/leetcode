package com.lzh.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/******************************************************
 * @Date: 2020-04-12
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L3LongSubStringNoRepeat {
    //利用滑动窗口的概念
    public static void main(String[] args) {
        String a = "pwwkew";//"a";//"abcabcbb"; //dvdf//"pwwkew" //tm
        int i = 0, j = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        while (j < a.length() && i < a.length()) {
            Character c = a.charAt(j);
            if (set.contains(c)) {
                if (c.equals(a.charAt(i++)))
                    set.remove(c);
            } else {
                j++;
                maxLength = Math.max(j - i, maxLength);
                set.add(c);

            }
        }
        System.out.println(maxLength);

    }

    public int method2(String s) {
        Map<Character, Integer> characters = new HashMap<>();

        int i = 0, len = 0, j = 0;
        while (j < s.length()) {
            char c = s.charAt(j);
            if (characters.containsKey(c)) {
                i = Math.max(characters.get(c) + 1, i);
            }
            len = Math.max(j - i + 1, len);
            characters.put(c, j);
            j++;
        }
        return len;
    }
}
