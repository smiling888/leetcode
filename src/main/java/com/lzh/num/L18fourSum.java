package com.lzh.num;

import java.util.*;

/******************************************************
 * @Date: 2021-02-20
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L18fourSum {
    /**
     * 暴力破解
     *
     * @param nums
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for (int i1 = 0; i1 < nums.length; i1++) {
            if (i1 > 0 && nums[i1] == nums[i1 - 1]) continue;

            for (int i2 = i1 + 1; i2 < nums.length; i2++) {
                if (i2 > i1 + 1 && nums[i2] == nums[i2 - 1]) continue;


                int sum = target - nums[i1] - nums[i2];
                int left = i2 + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum2 = nums[left] + nums[right];
                    if (sum == sum2) {
                        left++;
                        right--;
                        result.add(Arrays.asList(nums[i1] , nums[i2],nums[left] , nums[right]));
                        while (nums[left] == nums[left - 1]) {
                            left++;
                        }
                    } else if (sum2 < sum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        new L18fourSum().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);

    }
}
