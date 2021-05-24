package com.lzh.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiuxing.lzh
 * Date: 2021/5/24
 **/
public class L17_10majorityElement {
    /**
     * https://leetcode-cn.com/problems/find-majority-element-lcci/
     * 数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。
     */

    public int majorityElement(int[] nums) {
        int count = 0, prev = nums[0];
        for (int num : nums) {
            //如果 count == 0，说明之前的都抵消掉了，从新开始
            if (count == 0) {
                prev = num;
            }
            if (num == prev) {
                count++;
            } else {
                count--;
            }

        }
        if (count > 0) {
            return prev;
        }
        return -1;

    }
}
