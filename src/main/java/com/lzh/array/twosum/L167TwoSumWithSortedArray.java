package com.lzh.array.twosum;


/******************************************************
 * @Date: 2019-08-06
 * @Author: lzh <lzhhua110@126.com>
 *     https://leetcode.com/problems/two-sum/
 * ******************************************************/

public class L167TwoSumWithSortedArray {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                return new int[]{start, end};
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return null;
    }
}
