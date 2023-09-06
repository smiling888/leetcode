package com.lzh.array;

/**
 * Created on 2022-10-08
 * https://leetcode.cn/problems/search-a-2d-matrix/
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * <p>
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 */
public class L74SsearchMatrix {
    public static void main(String[] args) {
        System.out.println(
                searchMatrix(new int[][] {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}},
                        30));
    }

    public static boolean searchMatrix(int[][] arr, int target) {
        int i = 0, j = 0;
        int n = arr.length, m = arr[0].length;
        while (i < n && j < m && i >= 0 && j >= 0) {
            if (arr[i][j] == target) {
                return true;
            } else if (arr[i][j]> target) {
                 j++;
            } else {
                i++;
            }
        }
        return false;
    }
}
