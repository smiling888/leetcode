package com.lzh.array;

/******************************************************
 * @Date: 2021-02-16
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1720Xordecode {
    /**
     * (A^B)^B=A
     * https://leetcode-cn.com/problems/decode-xored-array/
     * 1720. 解码异或后的数组
     * <p>
     * 输入：encoded = [1,2,3], first = 1
     * 输出：[1,0,2,1]
     * 解释：若 arr = [1,0,2,1] ，那么 first = 1 且 encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/decode-xored-array
     *  x ^ y =z
     * 0 XOR 1=1 即 0 ^1 =1,y=x^z
     * 4 XOR 2=6 即 100 ^010 =110 y=x^z
     * 0 XOR 7=7
     * 猜想 X  XOR Y =Z  求Y时，Y=Math.abs(Z-X)
     *
     * @param encoded
     * @param first
     * @return
     */
    public int[] decode(int[] encoded, int first) {
        int[] res = new int[encoded.length + 1];
        res[0] = 1;
        for (int i = 0; i < encoded.length; i++) {
            res[i+1]=encoded[i]^res[i];
        }
        return res;
    }

}
