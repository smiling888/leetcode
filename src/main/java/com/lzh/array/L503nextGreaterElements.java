package com.lzh.array;

/******************************************************
 * @Date: 2021-03-06
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L503nextGreaterElements {
    /**
     * https://leetcode-cn.com/problems/next-greater-element-ii/
     * @param nums
     * @return
     */
    public int[] nextGreaterElements(int[] nums) {
        int[] maxArr=new int[nums.length];
        for(int index=0;index<nums.length;index++){
            int max=-1;
            for(int i=index+1;i%nums.length!=index;i++){
                if(nums[index]<nums[i%nums.length]){
                    max=nums[i%nums.length];
                    break;
                }
            }
            maxArr[index]=max;
        }
        return maxArr;
    }
}
