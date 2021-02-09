package com.lzh.string;

/******************************************************
 * @Date: 2021-02-09
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L461hammingDistance {
    /**
     * 使用异或 加+java的jdk进行计算
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {

        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args){
        new L461hammingDistance().hammingDistance(1,4);
    }


}
