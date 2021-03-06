package com.lzh.array;

import java.util.TreeMap;

/******************************************************
 * @Date: 2021-02-24
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L57insert {

    /**
     * 插入区间
     */

    public int[][] insert(int[][] intervals, int[] newInterval) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        boolean findstart = false;
        for (int[] arr : intervals) {
            if (!findstart) {
                if (newInterval[0] < arr[0]) {
                    arr[0] = newInterval[0];
                }
                findstart = true;
            }
            map.put(arr[0], 1);
            map.put(arr[1], -1);

        }


//        for (int[] arr : intervals) {
//            if (newInterval[0] = arr[0]) {
//
//            }
//
//        }


        return null;
    }
}
