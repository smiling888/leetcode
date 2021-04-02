package com.lzh.num;

/******************************************************
 * @Date: 2021-03-16
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1518numWaterBottles {
    /**
     * https://leetcode-cn.com/problems/water-bottles/
     * 换酒问题
     */
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        while(numBottles>0){
            int num=    numBottles/numExchange;
            total+=num;
            numBottles=num+numBottles-num*numExchange;
            if(numBottles<numExchange){
                break;
            }

        }
        return total;
    }

}
