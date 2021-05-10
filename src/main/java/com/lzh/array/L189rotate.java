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
        int count = 0;
        int start = 0;
        while (count < nums.length) {
            int pre = nums[start];
            int next = (start + k) % nums.length;
            while (next != start) {
                int tmp = nums[next];
                nums[next] = pre;
                pre = tmp;
                next = (next + k) % nums.length;
                count++;
                if (count == nums.length) {
                    break;
                }

            }
            nums[start] = pre;
            count++;
            start++;

        }

        for (int num : nums) {
            System.out.print(num);

        }
    }
    public static void main(String[] args) {
        new L189rotate().rotate2(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);

    }
    //todo 两次数据反转
    public void rotate3(int[] nums, int k) {

    }


}
