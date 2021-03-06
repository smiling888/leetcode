package com.lzh.string;

/******************************************************
 * @Date: 2021-02-24
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L0109isFlipedString {
    /**
     * https://leetcode-cn.com/problems/string-rotation-lcci/
     * 字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）
     */

    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int start = 0; start < s2.length(); start++) {
            int i = start, j = 0;
            int totalLen = 0;
            while (j < s1.length() && s1.charAt(i) == s2.charAt(j)) {
                totalLen++;
                j++;
                i++;
                if (i == s1.length()) i = 0;
            }
            if (totalLen == s1.length()) return true;
        }

        return false;
    }
}
