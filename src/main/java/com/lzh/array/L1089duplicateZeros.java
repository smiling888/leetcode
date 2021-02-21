package com.lzh.array;

/******************************************************
 * @Date: 2021-02-21
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1089duplicateZeros {
    public void duplicateZeros(int[] arr) {
        int zeroNum = 0;
        int j = 0;
        for (; j + zeroNum < arr.length; j++) {
            if (arr[j] == 0) zeroNum++;
        }
        //j需要往回口径一个位置
        j--;
        if (zeroNum == 0) {
            return;
        }
        int i = arr.length - 1;
        //84500007,最后是0没法复写的情况。
        if (j + zeroNum + 1 > arr.length) {
            arr[i--] = 0;
            j--;
        }
        for (; i >= 0; i--) {
            if (j >= 0) {
                arr[i] = arr[j--];
            }
            if (arr[i] == 0 && i >= 1) {
                arr[--i] = 0;
            }
        }
    }
}
