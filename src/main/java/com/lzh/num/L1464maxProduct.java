package com.lzh.num;

/******************************************************
 * @Date: 2021-02-20
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1464maxProduct {
    /**
     * 初始 a=[0],b=a[1]每次取一次遍历 每遍历一个数a[i].取这三个数大两个分别赋值给a和b。
     *
     * @param nums
     * @return
     */
    public int maxProduct(int[] nums) {
        int max1 = Math.max(nums[0], nums[1]);
        int max2 = Math.min(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];

            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}
