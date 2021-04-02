package com.lzh.array;

/******************************************************
 * @Date: 2021-03-18
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1685getSumAbsoluteDifferences {
    /**
     * https://leetcode-cn.com/problems/sum-of-absolute-differences-in-a-sorted-array/
     *
     * @param nums
     * @return
     */
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] res = new int[nums.length];
        int[] preFixSum = new int[nums.length+1];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            preFixSum[i+1] = sum;
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = sum - nums.length * nums[i] + 2 * (i * nums[i] - preFixSum[i]);

        }

        return res;
    }
}
