package com.lzh.string;

/******************************************************
 * @Date: 2021-02-20
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L14twolongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String com = strs[0];
        for (int i = 1; i < strs.length; i++) {
            com = twolongestCommonPrefix(com, strs[i]);
            if (com.length() == 0) {
                break;
            }
        }
        return com;
    }

    public static String twolongestCommonPrefix(String x, String y) {

        String com = "";
        if (x == "" || y == "") {
            return com;
        }
        int len = Math.min(x.length(), y.length());
        for (int i = 0; i < len; i++) {
            if (x.subSequence(i, i + 1).equals(y.subSequence(i, i + 1))) {
                com += x.subSequence(i, i + 1);
            } else {
                break;
            }
        }
        return com;
    }
}
