package com.lzh.array;

import java.util.ArrayList;
import java.util.List;

/******************************************************
 * @Date: 2021-02-08
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L448findDisappearedNumbers {

    /**
     * 空间复杂O(1)和时间复杂度O（n）。只能原地修改数据
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            int index = (nums[i] > 0 ? nums[i] : -nums[i]) - 1;
            int data = nums[index];
            nums[index] = data < 0 ? data : -data;

        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        new L448findDisappearedNumbers()
                .findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1
                });
    }
}
