package com.lzh.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/******************************************************
 * @Date: 2021-03-11
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1200minimumAbsDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ret = new ArrayList<>();
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) < diff) {
                //清空
                ret.clear();
                //新增
                ret.add(Arrays.asList(arr[i], arr[i + 1]));
                diff = arr[i + 1] - arr[i];
            } else if ((arr[i + 1] - arr[i]) == diff) {
                ret.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return ret;

    }
}
