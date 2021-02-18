package com.lzh.array;

/******************************************************
 * @Date: 2021-02-18
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L995minKBitFlips {
    /**
     * K 连续位的最小翻转次数
     *
     * 循环遍历 A，遇到0就翻转A[i,i+K).最后如果i+k>A.length则结束-1
     * 如
     */
    public static int minKBitFlips(int[] A, int K) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                if (i + K > A.length) {
                    return -1;
                }
                for (int j = i; j < i + K; j++) {
                    A[j] = 1 - A[j];//翻转0
                }
                count++;

            }
        }
        return count;
    }

    public static int minKBitFlips2(int[] A, int K) {
        int n = A.length;
       int[] diff = new int[n + 1];
        int ans = 0, revCnt = 0;
        for (int i = 0; i < n; ++i) {
            revCnt += diff[i];
            if ((A[i] + revCnt) % 2 == 0) {
                if (i + K > n) {
                    return -1;
                }
                ++ans;
                ++revCnt;
                --diff[i + K];
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        System.out.println(minKBitFlips2(new int[]{0, 1, 0}, 1));
        System.out.println(minKBitFlips2(new int[]{1, 1, 0}, 2));
        System.out.println(minKBitFlips2(new int[]{0, 0, 0, 1, 0, 1, 1, 0}, 3));
    }

}
