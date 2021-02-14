package com.lzh.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/******************************************************
 * @Date: 2021-02-12
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L79Wordexist {
    /**
     * https://leetcode-cn.com/problems/word-search/
     * board =
     * [
     * ['A','B','C','E'],
     * ['S','F','C','S'],
     * ['A','D','E','E']
     * ]
     * <p>
     * 给定 word = "ABCCED", 返回 true
     * 给定 word = "SEE", 返回 true
     * 给定 word = "ABCB", 返回 false
     * <p>
     * 回溯法
     *
     * @param board
     * @param word
     * @return
     */


    /**
     * 使用回溯法，
     * @param board
     * @param word
     * @return
     */
    int[][] arr = null;
    public boolean exist(char[][] board, String word) {
        arr = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean res = find(i, j, 0, board, word);
                if (res) {
                    return true;
                }
            }

        }

        return false;
    }

    /**
     * 回溯逻辑，找到追溯路径和递归结束条件
     * @param i
     * @param j
     * @param index
     * @param board
     * @param word
     * @return
     */
    private boolean find(int i, int j, int index, char[][] board, String word) {
        //递归结束条件
        if (index == word.length()) {
            return true;
        }


        //递归结束条件- 矩阵边界条件
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length
                || arr[i][j] == 1) {
            return false;
        }
        char tmpChar = word.charAt(index);
        if (board[i][j] == tmpChar) {
            arr[i][j] = 1;
            //递归条件，每个节点的四个方向
            boolean res = find(i - 1, j, index+1, board, word);
            if (!res) {
                res = find(i + 1, j, index+1, board, word);
            }
            if (!res) {
                res = find(i, j - 1, index+1, board, word);
            }
            if (!res) {
                res = find(i, j + 1, index+1, board, word);
            }
            if (!res) {
                arr[i][j] = 0;
            } else {
                return true;
            }

        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(new L79Wordexist().exist(new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        }, "SEE"));

    }
}
