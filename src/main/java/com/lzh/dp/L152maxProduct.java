package com.lzh.dp;

/**
 * https://leetcode-cn.com/problems/maximum-product-subarray/
 * @author jiuxing.lzh
 * Date: 2021/5/8
 **/
public class L152maxProduct {
    /**
     * 给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
     * dpMax[i]=max(dp[i]*nums[i],nums[i-1]*nums[i])
     * dpMin[i]=mix(dp[i]*nums[i],nums[i-1]*nums[i])
     */

    public int maxProduct(int[] nums) {
        int maxF = nums[0], minF = nums[0], ans = nums[0];
        int length = nums.length;
        for (int i = 1; i < length; ++i) {
            int mx = maxF, mn = minF;
            maxF = Math.max(mx * nums[i], Math.max(nums[i], mn * nums[i]));
            minF = Math.min(mn * nums[i], Math.min(nums[i], mx * nums[i]));
            ans = Math.max(maxF, ans);
        }
        return ans;
    }
}
