package com.lzh.string;

import java.util.Arrays;

/**
 * @author jiuxing.lzh
 * Date: 2021/5/24
 **/
public class L1657closeStrings {

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] w1 = new int[26];
        int[] w2 = new int[26];
        for (char w : word1.toCharArray()) {
            w1[w - 'a']++;
        }
        for (char w : word2.toCharArray()) {
            w2[w - 'a']++;
        }
        //集合要一样
        for (int i = 0; i < 26; i++) {
            if (w1[i] ==0&& w2[i]!=0 ||
                    w2[i] ==0&& w1[i]!=0 ) {
                return false;
            }
        }
        Arrays.sort(w1);
        Arrays.sort(w2);


        //数量要一样
        for (int i = 0; i < 26; i++) {
            if (w1[i] != w2[i]) {
                return false;
            }
        }

        return true;
    }

    public  static void main(String[] args){
        new L1657closeStrings().closeStrings("cabbba",
                "aabbss");
    }
}
