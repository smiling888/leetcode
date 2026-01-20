package com.lzh.array;

import java.util.HashSet;
import java.util.Set;

public class L119LongestConsecutive {
    public static void main(String[] args) {
    }

    public static int longestConsecutive(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        Set<Integer> hashSet = new HashSet<>();
        for (int i : nums) {
            hashSet.add(i);
        }
        int longest = 1;
        for (int i : nums) {
            //从序列的第一个数开始
            if (!hashSet.contains(i-1)) {
                int tmpLong=1;
                int tmpNum=i;
                while(hashSet.contains(tmpNum+1)){
                    tmpLong++;
                    tmpNum++;
                }
                longest=Math.max(tmpLong,longest);
            }
        }
        return longest;

    }
}
