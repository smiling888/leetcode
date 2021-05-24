package com.lzh.num;

/******************************************************
 * @Date: 2021-03-16
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1523countOdds {
    /**
     * 在区间范围内统计奇数数目
     * https://leetcode-cn.com/problems/count-odd-numbers-in-an-interval-range/submissions/
     * @param low
     * @param high
     * @return
     */
    public int countOdds(int low, int high) {
        low = low % 2 == 0 ? low : low - 1;
        high = high % 2 == 0 ? high : high + 1;
        return (high - low) / 2;

    }

    public static void main(String[] args) {
        new L1523countOdds().countOdds(8, 10);
    }


    public int countOdds2(int low, int high) {

        return pre(high) - pre(low - 1);
    }

    public int pre(int x) {
        return (x + 1) >> 1;
    }


}
