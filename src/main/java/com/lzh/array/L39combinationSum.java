package com.lzh.array;

import java.util.ArrayList;
import java.util.List;

/******************************************************
 * @Date: 2021-02-14
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L39combinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> conbine = new ArrayList();
        List<List<Integer>> result = new ArrayList<>();
        dsf(0, conbine, result, candidates, target);
        return result;
    }

    /**
     * 使用递归+剪枝的办法
     * @param index
     * @param conbine
     * @param result
     * @param candidates
     * @param target
     */
    private void dsf(int index, List<Integer> conbine, List<List<Integer>> result, int[] candidates, int target) {
        if (index == candidates.length) {
            return;
        }
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(conbine));
        }
        for (int i = index; i < candidates.length; i++) {
            int adata = candidates[i];
            conbine.add(adata);
            dsf(i,conbine, result, candidates, target - adata);
            conbine.remove(conbine.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new L39combinationSum().combinationSum(new int[]{2, 3, 6, 7}, 7));
    }
}
