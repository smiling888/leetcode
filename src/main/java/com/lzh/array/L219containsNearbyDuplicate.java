package com.lzh.array;

import java.util.HashSet;
import java.util.Set;

/******************************************************
 * @Date: 2019/6/16
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L219containsNearbyDuplicate {
    /**
     * https://leetcode-cn.com/problems/contains-duplicate-ii/
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //元素最多只有k个
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }

        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(new L219containsNearbyDuplicate().containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}
