package com.lzh.array;

import java.util.ArrayList;
import java.util.List;

/******************************************************
 * @Date: 2019-08-05
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/

/**
 * 二维数组回形遍历
 */
public class L54SpiralMatrix {
    /**
     * 二维变一维
     * @param matrix
     * @return
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return list;
        }
        if (matrix.length == 1) {//关键点一：边界判断
            for (int i = 0; i < matrix[0].length; i++) {
                list.add(matrix[0][i]);
            }
            return list;
        }

        if (matrix[0].length == 1) {
            for (int i = 0; i < matrix.length; i++) {
                list.add(matrix[i][0]);
            }
            return list;
        }

        int[][] matrixBak = new int[matrix.length][matrix[0].length];
        int director = 0;
        int startX = 0, startY = 0;
        int size = matrix.length * matrix[0].length;
        do {
            if (director == 0) {
                while (startY < matrix[0].length && matrixBak[startX][startY] == 0) {
                    list.add(matrix[startX][startY]);
                    matrixBak[startX][startY] = -1;
                    startY++;
                }
                startY--;//关键点一：边界判断，坐标回走
                startX++;
            } else if (director == 1) {
                while (startX < matrix.length && matrixBak[startX][startY] == 0) {
                    list.add(matrix[startX][startY]);
                    matrixBak[startX][startY] = -1;
                    startX++;
                }
                startX--;
                startY--;
            } else if (director == 2) {
                while (startY >= 0 && matrixBak[startX][startY] == 0) {
                    list.add(matrix[startX][startY]);
                    matrixBak[startX][startY] = -1;
                    startY--;
                }
                startY++;
                startX--;
            } else if (director == 3) {
                while (startX >= 0 && matrixBak[startX][startY] == 0) {
                    list.add(matrix[startX][startY]);
                    matrixBak[startX][startY] = -1;
                    startX--;
                }
                startX++;
                startY++;
            }
            director += 1;
            director %= 4;
        } while (list.size() < size);
        return list;
    }


    public static void main(String[] args) {
        int[][] a = new int[][]{
                {1, 2, 3,44},
                {4, 5, 6,66},
                {7, 8, 9,77},
                {10, 11, 12,13}
        };
        System.out.println(spiralOrder(a));
        System.out.println(a.length);
        System.out.println(a[0].length);
    }
}

