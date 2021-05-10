package com.lzh.array;

/******************************************************
 * @Date: 2021-04-06
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L80removeDuplicatesII {
    /**
     * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/
     * 删除有序数组中的重复项 II
     * 类似：L26 https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
     * @param nums
     * @return
     */

    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int slow = 0; slow < nums.length; ) {
            int numCount = 1;
            nums[index++] = nums[slow];
            for (int tmpSlow = slow++; slow < nums.length; slow++) {
                if (nums[slow] == nums[tmpSlow]) {
                    numCount++;
                    if (numCount <= 2) {
                        nums[index++] = nums[slow];
                    }
                } else {
                    break;
                }
            }


        }
        return index;
    }

    public static void main(String[] args) {
        new L80removeDuplicatesII().removeDuplicates(new int[]{1, 1,1, 2, 2, 3,3});
    }
}
