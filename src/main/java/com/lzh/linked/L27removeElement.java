package com.lzh.linked;

/******************************************************
 * @Date: 2021-03-23
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L27removeElement {
    /**
     * 快慢指针的。每个元素都要复制
     *
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }

    /**
     * 复制较少都情况
     *
     * @param nums
     * @param val
     * @return
     */
    public int removeElement2(int[] nums, int val) {
        int i = 0, n = nums.length - 1;

        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return i;
    }
}
