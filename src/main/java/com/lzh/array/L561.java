package com.lzh.array;

import java.util.Arrays;

/******************************************************
 * @Date: 2021-02-16
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L561 {
    /**
     * 数组拆分，先排序，再将0，1，3，。。。下标的书相加。
     * 假设有2n个数，和最大，意味着每个加数都要尽可能都大。从大往小看，
     * @param nums
     * @return
     */
    public int arrayPairSum(int[] nums) {
        if(nums==null){
            return 0;
        }
        Arrays.sort(nums);

        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}
