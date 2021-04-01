package com.lzh.string;

/******************************************************
 * @Date: 2021-03-14
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1662arrayStringsAreEqual {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i = 0, j = 0;
        int str1Index = 0, str2Index = 0;
        int word1len = 0, word2len = 0;
        while (i < word1.length && j < word2.length) {
            String str1 = word1[i];
            String str2 = word2[j];

            while (str1Index < str1.length() && str2Index < str2.length()) {
                if (str1.charAt(str1Index++) != str2.charAt(str2Index++)) {
                    return false;
                }
            }
            if (str1Index == str1.length()) {
                str1Index = 0;
                i++;
                word1len += str1.length();
            }

            if (str2Index == str2.length()) {
                str2Index = 0;
                j++;
                word2len += str2.length();
            }

        }
        if (word1len != word2len) {
            return false;
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(new L1662arrayStringsAreEqual().arrayStringsAreEqual
                (new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}));
    }
}
