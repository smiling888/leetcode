package com.lzh.array;

/******************************************************
 * @Date: 2021-02-19
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L75sortColors {

    public void sortColors(int[] nums) {
        int color = 0;
        int colorIndex = 0;

        while (color < 2) {
            int i = colorIndex;
            for (; i < nums.length; i++) {
                if (nums[i] == color) {
                    int tmp = nums[i];
                    nums[i] = nums[colorIndex];
                    nums[colorIndex++] = tmp;
                }
            }
            color++;
        }
    }
}
