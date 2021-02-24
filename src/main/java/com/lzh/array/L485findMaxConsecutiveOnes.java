package com.lzh.array;

/******************************************************
 * @Date: 2021-02-24
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L485findMaxConsecutiveOnes {
    /**
     * 最大连续 1 的个数
     *
     * 求两个0之间的距离，一次遍历即可。
     * 异常点，就是开始和结束是1的情况。
     * @param nums
     * @return
     */

    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int zeroIndex=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int len=i-zeroIndex-1;
                max=Math.max(len,max);
                zeroIndex=i;
            }
        }
        if(nums[nums.length-1]==1){
            int len=nums.length-zeroIndex-1;
            max=Math.max(len,max);
        }
        return max;
    }
}
