package com.lzh.string;

/******************************************************
 * @Date: 2021-03-05
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L779kthGrammar {
    /**
     * K基数位时，和N-1行的(k+1)/2的位相同
     * K时偶数位时，和N-1行的(k+1)/2的位相反
     *
     * @param N
     * @param K
     * @return
     */
    public int kthGrammar(int N, int K) {
        if (N == 1) {
            return 0;
        }
        if (K % 2 == 0) {
            return kthGrammar(N - 1, (K + 1) / 2);
        } else
            return 1 - kthGrammar(N - 1, (K + 1) / 2);

    }
}
