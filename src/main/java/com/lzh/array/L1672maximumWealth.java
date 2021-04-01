package com.lzh.array;

/******************************************************
 * @Date: 2021-03-14
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1672maximumWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;//统计每一个客户的所有资产
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            //保留最大值
            max = Math.max(max, temp);
        }
        return max;

    }
}
