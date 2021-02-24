package com.lzh.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/******************************************************
 * @Date: 2021-02-22
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1353maxEvents {
    /**
     * 定义一个map
     * key是开始天数， value是一个二维数组，0-1是start和endda
     *
     * @param events
     * @return
     */
    public static int maxEvents(int[][] events) {
        TreeMap<Integer, List<int[]>> treeMap = new TreeMap<>();
        int count = 0;
        int MAX = 0;
        for (int[] arr : events) {
            List<int[]> list = treeMap.getOrDefault(arr[0], new ArrayList<int[]>());
            list.add(arr);
            treeMap.put(arr[0], list);
            MAX = Math.max(MAX, arr[0]);
        }
        //遍历天数集合
        for (int day = 1; day <= MAX; day++) {
            List<int[]> list = treeMap.get(day);
            if (list == null || list.size() == 0) {
                continue;
            }
            int days = Integer.MAX_VALUE, minIndex = -1;
            //找到持续天数最少会议
            for (int i = 0; i < list.size(); i++) {
                int[] range = list.get(i);
                //找到参加的会议
                if (range[1] >= day && (range[1] - day + 1) < days) {
                    minIndex = i;
                    days = range[1] - day + 1;
                }
            }
            if (minIndex != -1) {
                count++;
                list.remove(minIndex);
            }
            //将当前开始天数+1放到新的treMap中

            List<int[]> tmplist = treeMap.getOrDefault(day + 1, new ArrayList<int[]>());
            tmplist.addAll(list);
            treeMap.put(day + 1, tmplist);
        }


        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxEvents(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 2}}));

    }
}
