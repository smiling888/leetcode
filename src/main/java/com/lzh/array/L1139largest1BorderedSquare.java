package com.lzh.array;

/******************************************************
 * @Date: 2021-02-21
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1139largest1BorderedSquare {
    /**
     * 使用动态规划
     * 1 先统计某个点[i][j] 左边和上边连续1点个数 用数组dp[i][j][0]和dp[i][j][1]表示
     * 2 然后求dp[i][j][0]和dp[i][j][1]点最小值最为边side
     * 3 然后找到dp[i - side + 1][j][0] >=side且 dp[i ][j- side + 1][1] >=side
     * 4 如果3满足条件则找到当前节点最大正方形，如果每找到另side--，循环2，知道找到或者side=1则停止。
     * @param grid
     * @return
     */
    public int largest1BorderedSquare(int[][] grid) {
        int[][][] dp = new int[grid.length + 1][grid[0].length + 1][2];
        int max = 0;

        for (int i = 1; i <= grid.length; i++) {
            for (int j = 1; j <= grid[0].length; j++) {
                if (grid[i - 1][j - 1] == 1) {
                    dp[i][j][0] = 1 + dp[i][j - 1][0];
                    dp[i][j][1] = 1 + dp[i - 1][j][1];
                }
            }
        }

        for (int i = 1; i <= grid.length; i++) {
            for (int j = 1; j <= grid[0].length; j++) {
                for (int side = Math.min(dp[i][j][0], dp[i][j][1]); side >= 1; side--) {
                    if (side <= max) {
                        continue;
                    }
                    if (dp[i - side + 1][j][0] >= side && dp[i][j - side + 1][1] >= side) {
                        max = side;
                    }
                }
            }
        }

        return max * max;
    }

    public static void main(String[] args) {
        new L1139largest1BorderedSquare().largest1BorderedSquare(
                new int[][]{
                        {1, 1, 1}, {1, 0, 1}, {1, 1, 1}
                }
        );
    }
}
