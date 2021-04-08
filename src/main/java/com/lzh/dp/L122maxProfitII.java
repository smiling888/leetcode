package com.lzh.dp;

/**
 * @author jiuxing.lzh
 * Date: 2021/4/7
 **/
public class L122maxProfitII {
    /**
     * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
     * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        // dp[i]=max(dp[i]-min,maxProfit)..用dp[i]表示第i天卖出的收益，则dp[i]=max(price[i]-min,maxProfit)
        //dp[i][0] 表示第 i 天交易完后手里没有股票的最大利润，
        // dp[i][1] 表示第 i 天交易完后手里持有一支股票的最大利润（i 从 0 开始）。
        //

        int[] dp = new int[prices.length];
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int min = Integer.MAX_VALUE, maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - min);
                dp[i] = maxProfit;
            }
        }
        return maxProfit;
    }
}
