package com.lzh.array;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/******************************************************
 * @Date: 2021-03-06
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L994orangesRotting {

    public int orangesRotting(int[][] grid) {
        Set<String> allRot = new HashSet<>();
        Set<String> fresh = new HashSet<>();
        Set<String> curRot = new HashSet<>();
        //初始化
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                if (grid[i][j] == 1) {
                    fresh.add(i + "," + j);
                } else {
                    curRot.add(i + "," + j);

                }
            }
        }
        allRot.addAll(curRot);
        int time = 0;
        do {
            if (fresh.size() == 0) {
                break;
            }
            Set<String> newRot = new HashSet<>();
            for (String rotIndex : curRot) {
                String[] indexArr = rotIndex.split(",");
                Integer i = Integer.valueOf(indexArr[0]);
                Integer j = Integer.valueOf(indexArr[1]);
                //上边
                if (fresh.contains((i - 1) + "," + j)) {
                    newRot.add((i - 1) + "," + j);
                    fresh.remove((i - 1) + "," + j);
                }
                //下
                if (fresh.contains((i + 1) + "," + j)) {
                    newRot.add((i + 1) + "," + j);
                    fresh.remove((i + 1) + "," + j);
                }
                //左
                if (fresh.contains(i + "," + (j - 1))) {
                    newRot.add(i + "," + (j - 1));
                    fresh.remove(i + "," + (j - 1));
                }
                //右
                if (fresh.contains(i + "," + (j + 1))) {
                    newRot.add(i + "," + (j + 1));
                    fresh.remove(i + "," + (j + 1));
                }
            }


            if (newRot.size() == 0) {
                break;
            }
            curRot = newRot;
            allRot.addAll(newRot);
            time++;
        } while (true);
        if (fresh.size() != 0) {
            return -1;
        }
        return time;

    }

    public static void main(String[] args) {
        new L994orangesRotting().orangesRotting(new int[][]{
                {2, 1, 1}, {0, 1, 1}, {1, 0, 1}
        });
    }
}
