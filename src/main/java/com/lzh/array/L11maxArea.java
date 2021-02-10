package com.lzh.array;

/******************************************************
 * @Date: 2021-02-10
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L11maxArea {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                max = Math.max(max, area);
            }
        }
        return max;
    }

    /**
     * 双指针法，
     * @param height
     * @return
     */

    public int maxArea2(int[] height) {
        int max = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(max, area);
            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }

        }
        return max;
    }
}
