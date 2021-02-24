package com.lzh.array;

/******************************************************
 * @Date: 2021-02-22
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L766isToeplitzMatrix {

    public boolean isToeplitzMatrix2(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean res = isT(matrix, 0, 0);
        return res;
    }

    private boolean isT(int[][] matrix, int r, int c) {
        if (r == (matrix.length - 1) || c == (matrix[0].length - 1)) {
            return true;
        }

        int i = r + 1, j = c + 1;
        while (i < matrix.length && j < matrix[0].length) {
            if (matrix[i][j] != matrix[i - 1][j - 1]) {
                return false;
            }
            i++;
            j++;
        }
        boolean res = isT(matrix, r + 1, c);
        return res && isT(matrix, r, c + 1);
    }
}
