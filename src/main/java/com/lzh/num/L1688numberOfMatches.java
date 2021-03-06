package com.lzh.num;

/******************************************************
 * @Date: 2021-02-22
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1688numberOfMatches {

    public int numberOfMatches(int n) {
        return n - 1;
    }

    public int numberOfMatches2(int n) {
        int result = 0;
        while (n > 1) {
            int half = n >> 1;
            result += half;
            n = half + n % 2;
        }
        return result;


    }
}
