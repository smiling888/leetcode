package com.lzh.array.twosum;

import java.util.HashMap;
import java.util.Map;

/******************************************************
 * @Date: 2019-08-06
 * @Author: lzh <lzhhua110@126.com>
 *     https://leetcode.com/problems/two-sum/
 * ******************************************************/

public class L1TwoSum {
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
}
