package com.lzh.string;

/**
 * @author liaozhenhua <liaozhenhua@kuaishou.com>
 * Created on 2021-08-13
 * https://leetcode-cn.com/problems/check-if-string-is-a-prefix-of-array/
 */
public class IsPrefixString {
    public boolean isPrefixString(String s, String[] words) {
        int i = 0;

        for (String str : words) {
            int j = 0;
            for (; j < str.length(); j++) {
                if (i < s.length() && s.charAt(i++) != str.charAt(j)) {
                    return false;
                }else{
                    return false;
                }

            }
            if (j == str.length() && i == s.length()) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new IsPrefixString().isPrefixString("aa", new String[] {"aa", "aaaa", "banana"}));
    }
}
