package com.lzh.num;

/******************************************************
 * @Date: 2021-02-21
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L400findNthDigit {

    public int findNthDigit(int n) {
        int i = 1;
        int count = 0;
        while (i > 0) {

            String numRrr = String.valueOf(i);
            if (count + numRrr.length() < n) {

                count += numRrr.length();
            } else {
                return numRrr.charAt(n - count - 1) - '0';
            }

            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        String a = "123";
        System.out.println((int) (a.charAt(1)) - '0');
        System.out.println(a.charAt(2));
    }
}
