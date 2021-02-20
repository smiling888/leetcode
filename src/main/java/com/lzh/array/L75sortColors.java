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

    /**
     * 遍历一次。只有遇到0就往左边放，遇到2就往右边放
     * 定义3个指针
     * 10210 当i=2时 01210 此时交换后，01012 此时还需要i需要往回重新指
     *
     * @param nums
     */
    public void sortColors2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        for (int i = 0; i < right; i++) {
            if (nums[i] == 0) {
                swap(nums, left, i);
                left++;
            }
            if (nums[i] == 2) {
                swap(nums, right, i);
                right--;

                if (nums[i] != 1) {
                    i--;
                }
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
