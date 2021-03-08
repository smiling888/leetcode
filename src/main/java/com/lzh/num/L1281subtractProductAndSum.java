package com.lzh.num;

/******************************************************
 * @Date: 2021-03-08
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1281subtractProductAndSum {
//    给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。

    public int subtractProductAndSum(int n) {
        int mSum = 1;
        int addSum = 0;
        while (n != 0) {
            int a = n % 10;
            n = n / 10;
            mSum = mSum * a;
            addSum = addSum + a;
        }
        return mSum - addSum;
    }
}
