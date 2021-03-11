package com.lzh.array;

/******************************************************
 * @Date: 2021-03-07
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L581findUnsortedSubarray {

    /**
     * 最短无序连续子数组
     * 暴力法。
     * 先从左边一个个遍历，左边的数字都比右边都小。
     * 右边都都比左边都大。
     */
    public int findUnsortedSubarray(int[] nums) {
        int minIndex = 0;
        int maxIndex = nums.length - 1;
        for (; minIndex < nums.length; minIndex++) {
            boolean finish = false;
            for (int i = minIndex + 1; i < nums.length; i++) {
                if (nums[minIndex] > nums[i]) {
                    finish = true;
                    break;
                }
            }
            if (finish) {
                break;

            }
        }
        if (minIndex == nums.length) {
            return 0;
        }

        for (; maxIndex >= minIndex; maxIndex--) {
            boolean finish = false;
            for (int i = maxIndex - 1; i >= 0; i--) {
                if (nums[maxIndex] < nums[i]) {
                    finish = true;
                    break;
                }
            }
            if (finish) {
                break;

            }
        }
        return maxIndex - minIndex + 1;

    }
}
