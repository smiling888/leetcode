package com.lzh.array;

import java.util.Arrays;

/**
 * @author jiuxing.lzh
 * Date: 2021/3/28
 **/
public class L189rotate {
    /**
     * 旋转数组。使用空间置换  .相似的链表旋转。反转字符串
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int[] tmpNums = Arrays.copyOf(nums, nums.length);
//        k = nums.length - k;
        for (int i = 0; i < nums.length; i++) {
            nums[(i + k) % nums.length] = tmpNums[i];
        }
    }

    /**
     * 原地旋转
     * 两两交换
     *
     * @param nums
     * @param k
     */
    public void rotate2(int[] nums, int k) {
        int pre = nums[0];
        for (int count = 0; count < nums.length; count++) {
            int swapIndex = (count + k) % nums.length;
            int tmp = nums[swapIndex];
            nums[swapIndex] = pre;
            pre = tmp;
        }
    }

    //todo 两次数据反转
    public void rotate3(int[] nums, int k) {

    }
}
