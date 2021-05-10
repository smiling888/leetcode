/******************************************************
 * Copyright (C) 2018 iQIYI.COM - All Rights Reserved
 *
 * This file is part of qisheng
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential
 *
 * @Date: 2019/6/13
 * @Author: lzh <liaozhenhua@qiyi.com>
 * ******************************************************/
package com.lzh.string;

public  class L344ReverseString {
    public synchronized void reverseString(char[] s) {
        if (s == null) {
            return;
        }
        int half = s.length / 2;
        for (int i = 0; i < half; i++) {
            char tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
        }
    }

    /**
     * 每长度2k的的对前k个进行反转，如果s.length<k 直接进行反转。
     * @param s
     * @param k
     * @return
     */

    public String reserverString(String s,int k){
        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }
        return new String(a);
    }
}

