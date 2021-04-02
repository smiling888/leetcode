package com.lzh.array.twosum;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/******************************************************
 * @Date: 2019-08-06
 * @Author: lzh <lzhhua110@126.com>
 *     https://leetcode.com/problems/two-sum/
 * ******************************************************/

public class L1099TwoSumLessThanK {
    public int[] twoSum(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return null;
        }
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            int b=target-nums[i];
            if(map.containsKey(b)){
                return new int[]{map.get(b),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        L1099TwoSumLessThanK dataDesign = new L1099TwoSumLessThanK();
        int[] data=new int[]{3,1,2};
        //在原来的数组上修改，且是递增排序。
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
