package com.lzh.dp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/******************************************************
 * @Date: 2021-03-21
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L139wordBreak {
    /**
     * https://leetcode-cn.com/problems/word-break/
     * <p>
     * dp[i,j] 0<i<j
     * dp[i]=dp[j] && check(s[j..i−1])
     */

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        int[] dp = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            String fisrtSub = s.substring(0, i + 1);
            if (set.contains(fisrtSub)) {
                dp[i] = 1;
            } else {
                continue;
            }
            for (int j = i; j < s.length(); j++) {

            }

        }
        return true;
    }
}
