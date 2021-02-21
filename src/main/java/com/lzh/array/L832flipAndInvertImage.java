package com.lzh.array;

/******************************************************
 * @Date: 2021-02-21
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L832flipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++){
            int l=0;
            int r=A[0].length-1;
            while(l<r){
                int tmp=A[i][l];
                A[i][l]=1-A[i][r];
                A[i][r]=1-tmp;
                l++;
                r--;
            }
            if(A[0].length%2!=0){
                A[i][A[0].length/2]=1-A[i][A[0].length/2];
            }
        }
        return A;

    }
}
