package com.lzh.array;

/******************************************************
 * @Date: 2021-04-07
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L26removeDuplicates {
    /**
     * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
     * 删除有序数组中的重复项
     * 类似：L80 https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int cur = nums[0], index = 0;
        for (int fast = index + 1; fast < nums.length; fast++) {
            if (cur != nums[fast]) {
                cur = nums[fast];
                nums[++index] = cur;
            }
        }
        return index + 1;

    }
}
