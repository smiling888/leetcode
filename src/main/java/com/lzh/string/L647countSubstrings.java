package com.lzh.string;

/******************************************************
 * @Date: 2021-02-15
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L647countSubstrings {
    /**
     * 运行超时
     * @param s
     * @return
     */
    @Deprecated
    public int countSubstrings(String s) {
        int count = 0;
        for (int step = 1; step <= s.length(); step++) {
            for (int i = 0; i < s.length(); i++) {
                if (i + step <= s.length()) {
                    count += isHuiwen(s.substring(i, i + step));
                }
            }
        }
        return count;

    }


    private int isHuiwen(String str) {
        if (str == null || str == "") {
            return 0;

        }
        int start = 0, end = str.length()-1;
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--)) {
                return 0;
            }
        }
        System.out.println(str);

        return 1;
    }

    /**
     * 中心扩散法，
     * 使用 l = i / 2, r = i / 2 + i % 2; 可以获取
     * 奇偶数问题
     * @param s
     * @return
     */
    public int countSubstrings2(String s) {
        int n = s.length(), ans = 0;
        for (int i = 0; i < 2 * n - 1; ++i) {
            //核心算法
            int l = i / 2, r = i / 2 + i % 2;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                --l;
                ++r;
                ++ans;
            }
        }
        return ans;
    }





    public static void main(String[] args) {
        new L647countSubstrings().countSubstrings("aba");
    }
}
