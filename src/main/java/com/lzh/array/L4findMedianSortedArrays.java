package com.lzh.array;

/******************************************************
 * @Date: 2021-02-19
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L4findMedianSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int n1start = 0, n2start = 0;
        int total = nums1.length + nums2.length;
        boolean prime = (total) % 2 != 0;//是否基数
        int i = 0;
        for (; i < total / 2 + 1; i++) {
            if (n1start == nums1.length) {
                nums[i] = nums2[n2start++];
            }else if (n2start == nums2.length) {
                nums[i] = nums1[n1start++];
            }else if(nums1[n1start] < nums2[n2start]) {
                nums[i] = nums1[n1start++];
            } else {
                nums[i] = nums2[n2start++];
            }
        }
        double mid = 0;
        if (prime) {
            mid = nums[i - 1];
        } else {
            mid = (nums[i - 2] + nums[i - 1]) / 2.0;
        }
        return mid;

    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
}
