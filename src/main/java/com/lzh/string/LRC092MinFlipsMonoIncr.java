package com.lzh.string;

/**
 * Created on 2021-081git -13
 * https://leetcode-cn.com/problems/check-if-string-is-a-prefix-of-array/
 */
public class LRC092MinFlipsMonoIncr {
    public int minFlipsMonoIncr(String s) {
        char[] arry = s.toCharArray();
        int d0 = 0, d1 = 0;
        for (int i = 0; i < arry.length; i++) {
            d1 = Math.min(d0, d1);
            if (arry[i] == '0') {
                d1++;

            } else {
                d0++;
            }
        }
        return Math.min(d0, d1);

    }


    public static void main(String[] args) {
        System.out.println(new LRC092MinFlipsMonoIncr().minFlipsMonoIncr("00110"));
    }
}
