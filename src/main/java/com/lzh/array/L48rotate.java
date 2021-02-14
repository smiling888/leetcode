package com.lzh.array;

/******************************************************
 * @Date: 2021-02-14
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L48rotate {
    /**
     * anew[j][collength-i-1]=a[i][j]
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
