package com.lzh.string;

import java.util.ArrayList;
import java.util.List;

/******************************************************
 * @Date: 2021-03-08
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L438findAnagrams {
    /**
     * 计算字符串差值
     *
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) {
            return result;
        }
        int[] sMap = new int[26];
        int[] pMap = new int[26];
        for (int i = 0; i < p.length(); i++) {
            sMap[s.charAt(i) - 'a']++;
            pMap[p.charAt(i) - 'a']++;
        }
        //滑动窗口
        for (int i = 0; i < s.length() - p.length(); i++) {
            if (isMatch(sMap, pMap)) {
                result.add(i);
            }
            sMap[s.charAt(i + p.length()) - 'a']++;
            sMap[s.charAt(i) - 'a']--;
        }
        if (isMatch(sMap, pMap)) {
            result.add(s.length() - p.length());
        }
        return result;
    }

    private boolean isMatch(int[] charArray1,int[] charArray2 ){
        for (int i = 0; i < charArray1.length; i++) {
            //这里只要出现一个字母个数不一样，就直接返回false
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
//        findAnagrams("baa", "aa");
    }
}
