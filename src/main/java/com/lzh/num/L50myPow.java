package com.lzh.num;

/******************************************************
 * @Date: 2021-02-18
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L50myPow {
    public static double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }

    /**
     * 2**10 = (2**5 )*(2**5)=((2**2)*2)
     * @param x
     * @param n
     * @return
     */

    public static double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }


    public static void main(String[] args) {
        System.out.println(myPow(2.0, 10));
    }
}
