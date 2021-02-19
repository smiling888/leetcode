package com.lzh.computenumber;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;

/******************************************************
 * @Date: 2019-06-30
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L172FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        if (n < 1) {
            return 0;
        }
        int fives = 0;
        for (long i = 5; i <= n; i *= 5) { // i is 5, 25, 125, 625 ...
            fives += n/i; // to count how many multiples of "i" are in range 1...n, we just do n/i
        }
        return  fives;
    }

    public static void main(String[] agr) {
        System.out.println(2147483647+5);
//        System.out.println(new L172FactorialTrailingZeroes().trailingZeroes(5));
//        System.out.println(new L172FactorialTrailingZeroes().trailingZeroes(3));
//        System.out.println(new L172FactorialTrailingZeroes().trailingZeroes(2147483647));
        System.out.println(Arrays.toString(new int[]{12,3,312,4123}));
//        ListIterator
        ReentrantLock lock=new ReentrantLock();
        lock.tryLock();
    }
}
