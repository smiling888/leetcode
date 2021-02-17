package com.lzh.array;

/******************************************************
 * @Date: 2021-02-17
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L566matrixReshape {
    /**
     * 下标 {
     * i=x / n
     * j=x % n
     * ​
     */

    public int[][] matrixReshape(int[][] nums, int r, int c) {

        if(r*c!=nums.length*nums[0].length){
            return nums;
        }
        int sc=nums[0].length;
        int count=nums.length*nums[0].length;
        int[][] reArr=new int[r][c];
        for(int i=0;i<count;i++){
            reArr[i/c][i%c]=nums[i/sc][i%sc];
        }
        return reArr;
    }
}
