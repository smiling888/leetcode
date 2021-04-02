package com.lzh.dp;

/******************************************************
 * @Date: 2021-03-21
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L322coinChange {
    /**
     * https://leetcode-cn.com/problems/coin-change/
     * https://zhuanlan.zhihu.com/p/78220312
     * dp(n) 的定义：输入一个目标金额 n，返回凑出目标金额 n 的最少硬币数量。
     * 定义dp[n]=new int[n];
     * <p>
     * 转移方程：for coin in coins:
     *          dp(n)=min(dp(n),1 + dp(n - coin))
     * <p>
     *
     * 初始状态：dp(0)=0
     */

    public int coinChange(int[] coins, int amount) {

        return countDp(coins, amount, new int[amount]);
    }

    public int countDp(int[] coins, int amount, int[] dp) {
        int count = -1;
        //初始状态
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        if (dp[amount - 1] != 0) {
            return dp[amount - 1];
        }
        for (int coin : coins) {

            int tmp = countDp(coins, amount - coin, dp);
            if (tmp == -1) {
                continue;
            }
            tmp = tmp + 1;
            if (count == -1) {
                count = tmp;
            }
            count = Math.min(tmp, count);
            dp[amount - 1] = count;

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new L322coinChange()
                .coinChange(new int[]{186,419,83,408}, 6249));
    }

    //贪心算法
    public int coinChange2(int[] coins, int amount) {

        return 1;
    }


    // 数组大小为 amount + 1，初始值也为 amount + 1
    //不用递归解法
//    vector<int> dp(amount + 1, amount + 1);
//    // base case
//    dp[0] = 0;
//    // 外层 for 循环在遍历所有状态的所有取值
//    for (int i = 0; i < dp.size(); i++) {
//        // 内层 for 循环在求所有选择的最小值
//        for (int coin : coins) {
//            // 子问题无解，跳过
//            if (i - coin < 0) continue;
//            dp[i] = min(dp[i], 1 + dp[i - coin]);
//        }
//    }
//    return (dp[amount] == amount + 1) ? -1 : dp[amount];


//    public int coinChange(int[] coins, int amount) {
//        if (amount < 1) {
//            return 0;
//        }
//        return coinChange(coins, amount, new int[amount]);
//    }
//
//    private int coinChange(int[] coins, int rem, int[] count) {
//        if (rem < 0) {
//            return -1;
//        }
//        if (rem == 0) {
//            return 0;
//        }
//        if (count[rem - 1] != 0) {
//            return count[rem - 1];
//        }
//        int min = Integer.MAX_VALUE;
//        for (int coin : coins) {
//            int res = coinChange(coins, rem - coin, count);
//            if (res >= 0 && res < min) {
//                min = 1 + res;
//            }
//        }
//        count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
//        return count[rem - 1];
//    }


}
