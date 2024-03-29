package com.lzh.array;

/******************************************************
 * @Date: 2021-02-14
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L48rotate {
    /**
     * https://leetcode-cn.com/problems/rotate-image/
     * anew[j][collength-i-1]=a[i][j]
     *给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
     *
     * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
     *
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        int[][] matrixNew = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrixNew[j][matrix.length-i-1]=matrix[i][j];

            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]=matrixNew[i][j];

            }
        }

    }

    //方法二 两次翻转，先上下翻转，再斜对角翻转。
}
