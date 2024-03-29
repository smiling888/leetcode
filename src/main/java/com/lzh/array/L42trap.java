package com.lzh.array;

/******************************************************
 * @Date: 2021-02-14
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/

/**
 * 接雨水
 */
public class L42trap {
    /**
     * https://leetcode-cn.com/problems/trapping-rain-water/
     * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
     * 双指针法  只要 \text{right\_max}[i]>\text{left\_max}[i]right_max[i]>left_max[i] （元素 0 到元素 6），积水高度将由 left_max 决定
     *
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = 0;
        int leftMax = 0, rightMax = 0;
        while (left < right) {

            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    ans += (leftMax-height[left] );
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    ans += (rightMax-height[right]  );
                }
                right--;
            }

        }
        return ans;
    }
}
