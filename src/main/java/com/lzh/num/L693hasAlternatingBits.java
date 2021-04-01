package com.lzh.num;

/**
 * @author jiuxing.lzh
 * Date: 2021/3/28
 **/
public class L693hasAlternatingBits {
    /**
     *  交替位二进制数
     *  https://leetcode-cn.com/problems/binary-number-with-alternating-bits/
     * @param n
     * @return
     */
    public boolean hasAlternatingBits(int n) {
        int bit=n%2;
        n=n/2;
        while(n>0){
            int preBit=n%2;
            n=n/2;
            if((bit^preBit)==0){
                return false;
            }
            bit=preBit;

        }

        return true;

    }

    boolean hasAlternatingBits2(int n) {
        n = (n ^ (n >> 1));
        return (n & ((long)n + 1)) == 0;
    }


}
