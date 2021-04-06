package com.lzh.array;

/******************************************************
 * @Date: 2021-04-04
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L88merge {
    /**
     * 合并两个有序数组
     * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
     * https://leetcode-cn.com/problems/merge-sorted-array/
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2 == null || nums2.length == 0) {
            return;
        }
        int end = nums1.length - 1;
        int nums1End = m - 1;
        int nums2End = n - 1;
        while (nums2End >= 0 && nums1End >= 0) {
            if (nums1[nums1End] > nums2[nums2End]) {
                nums1[end--] = nums1[nums1End];
                nums1[nums1End] = 0;
                nums1End--;
            } else {
                nums1[end--] = nums2[nums2End--];
            }

        }
        //nums2没遍历完
        while (nums2End >= 0) {
            nums1[end--] = nums2[nums2End--];
        }
    }
}
