package com.lzh.num;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiuxing.lzh
 * Date: 2021/5/24
 **/
public class L670maximumSwap {

    public int maximumSwap(int num) {
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            int a = num % 10;
            num = num / 10;
            list.add(0, a);
        }
        //保存dp[i+1]=Math.max(dp[i], list.get(i)); 最近的最大值
        int dp[] = new int[list.size() + 1];
        dp[0] = 0;
        for (int i = 0; i < list.size(); i++) {
            dp[i + 1] = Math.max(dp[i], list.get(i));
        }

        return 0;

    }
}
