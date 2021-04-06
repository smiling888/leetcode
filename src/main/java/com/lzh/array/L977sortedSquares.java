package com.lzh.array;

/******************************************************
 * @Date: 2021-04-04
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L977sortedSquares {
    /**
     * 有序数组的平方
     * https://leetcode-cn.com/problems/squares-of-a-sorted-array/
     * 双指针,时间，空间复杂度O(n)
     */

    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int start = 0, end = nums.length - 1;
        int i = nums.length - 1;
        while (i >= 0) {
            int s = Math.abs(nums[start]);
            int e = Math.abs(nums[end]);
            if (s < e) {
                res[i--] = e * e;
                end--;
            } else {
                res[i--] = s * s;
                start++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new L977sortedSquares().sortedSquares(new int[]{-7, -3, 2, 3, 11});
    }
}
