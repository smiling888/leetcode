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
    public static void emthod(String[] args) {
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


    public static int method3(String s) {
        int winStart = 0, len = 0;
        Map<Character, Integer> window = new HashMap<>();
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            //有重复数据，需要重置滑动窗口开始位置
            if (window.containsKey(c)) {
                //避免 abba 这种情况，将窗口往前延伸
                winStart = Math.max(window.get(c) + 1,winStart);
            }
            len = Math.max(end - winStart + 1, len);
            window.put(c, end);
        }
        return len;
    }

    public static void main(String[] args){
//        System.out.println(method3("abcabc"));
//        System.out.println(method3("aaaa"));
//        System.out.println(method3("pwwkew"));
        System.out.println(method3("abba"));
    }


}
