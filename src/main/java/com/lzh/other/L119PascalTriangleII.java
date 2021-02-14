/******************************************************
 * Copyright (C) 2018 iQIYI.COM - All Rights Reserved
 *
 * This file is part of qisheng
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential
 *
 * @Date: 2019/5/26
 * @Author: lzh <liaozhenhua@qiyi.com>
 * ******************************************************/
package com.lzh.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Input: 3
 * Output: [1,3,3,1]
 * https://leetcode.com/problems/pascals-triangle-ii/
 */
public class L119PascalTriangleII {

    public List<Integer> getRow(int rowIndex) {
        int row = rowIndex + 1;
        Integer[] res = new Integer[rowIndex + 1];
        Arrays.fill(res, 1);

        for (int i = 1; i < rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                res[j] = res[j] + res[j - 1];
            }
            System.out.println(Arrays.asList(res));
        }
        return Arrays.asList(res);
    }

    public List<Integer> getRow2(int rowIndex) {
        List<Integer> result = new ArrayList();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> tmpResult = new ArrayList();
            for (int j = 0; j < result.size(); j++) {
                if (j + 1 >= result.size()) {
                    tmpResult.add(result.get(j));
                } else {
                    tmpResult.add(result.get(j) + result.get(j + 1));
                }
            }
            tmpResult.add(0, 1);
            result = tmpResult;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new L119PascalTriangleII().getRow2(3));
    }
}
