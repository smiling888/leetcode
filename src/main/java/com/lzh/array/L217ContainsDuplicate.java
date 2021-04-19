package com.lzh.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/******************************************************
 * @Date: 2019/6/16
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L217ContainsDuplicate {
    /** hash表，或者排序
     * Given an array of integers, find if the array contains any duplicates.
     * <p>
     * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
     * <p>
     * Example 1:
     * <p>
     * Input: [1,2,3,1]
     * Output: true
     * Example 2:
     * <p>
     * Input: [1,2,3,4]
     * Output: false
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }else{
                set.add(i);
            }
        }
        return false;
    }

    /**
     * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k
     * Example 2:

     Input: nums = [1,0,1,1], k = 1
     Output: true
     Example 3:

     Input: nums = [1,2,3,1,2,3], k = 2
     Output: false
     * @param nums
     * @return
     */
    public boolean containsDuplicateII(int[] nums,int k) {
        if(nums == null || nums.length==0 || k<1) return false;

        for(int i=0;i<nums.length;i++)
            for(int j=i+1; j<=i+k && j<nums.length; j++)
            {
                if(nums[i]==nums[j])
                    return true;
            }
        return false;

    }


    public static void main(String[] args){
        System.out.println(new L217ContainsDuplicate().containsDuplicateII(new int[]{1},1));
        System.out.println(new L217ContainsDuplicate().containsDuplicate(new int[]{0}));
        System.out.println(new L217ContainsDuplicate().containsDuplicate(new int[]{1,4,3,1}));
    }
}
