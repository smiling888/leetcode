package com.lzh.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/******************************************************
 * @Date: 2021-02-24
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1424findDiagonalOrder {
    /**
     * 遍历-每次获取第一个元素，从
     * row-当前遍历的行数。从row开始像0开始遍历，取每次遍历到nums.get(row)到第0个元素，然后删除
     *https://leetcode-cn.com/problems/diagonal-traverse-ii/
     * @param nums
     * @return
     */
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        boolean hasData = false;
        int total = 0;
        for (List<Integer> num : nums) {
            total += num.size();
        }
        if (total == 0) return new int[0];
        int[] res = new int[total];
        int i = 0, row = 0;

        do {
            hasData = false;
            for (int curRow = row; curRow >= 0; curRow--) {
                List<Integer> list = nums.get(curRow);
                if (list.size() > 0) {
                    res[i++] = list.remove(0);
                    hasData = true;
                } else {
                    nums.remove(curRow);
                }
            }
            row = row + 1 >= nums.size() ? row : nums.size() - 1;
        } while (hasData);
        return res;
    }

    /**
     * i+j 相同下表在一列，
     * @param nums
     * @return
     */

    public int[] findDiagonalOrder2(List<List<Integer>> nums) {
        int len = 0;
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < nums.size(); i++) {
            len += nums.get(i).size(); // 获取最后要返回的数组的长度，即元素个数
            for (int j = 0; j < nums.get(i).size(); j++) {
                if (map.containsKey(i + j)) {
                    map.get(i + j).add(nums.get(i).get(j));
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums.get(i).get(j));
                    map.put(i + j, list);
                }
            }
        }
        int[] ans = new int[len];
        int index = 0;
        for (int key : map.keySet()) { // 遍历map
            List<Integer> list = map.get(key);
            for (int j = list.size() - 1; j >= 0; j--) { // 根据题目的输出要求确定生成数组中元素的顺序
                ans[index] = list.get(j);
                index++;
            }
        }
        return ans;
    }

}
