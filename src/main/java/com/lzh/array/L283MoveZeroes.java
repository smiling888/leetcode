package com.lzh.array;

/******************************************************
 * @Date: 2021-02-08
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L283MoveZeroes {

    public void moveZeroes(int[] nums) {
        for (int zeroIdex = 0, nonZeroIndex = 1; zeroIdex < nums.length && nonZeroIndex < nums.length; ) {
            //找到下一个0 索引
            while (zeroIdex < nums.length && nums[zeroIdex] != 0) {
                zeroIdex++;
            }
            nonZeroIndex = nonZeroIndex <= zeroIdex ? zeroIdex + 1 : nonZeroIndex;

            //找到下一个非0索引
            while (nonZeroIndex < nums.length && nums[nonZeroIndex] == 0) {
                nonZeroIndex++;
            }
            if (nonZeroIndex >= nums.length) {
                return;
            }
            //找到后交换
            int tmp = nums[zeroIdex];
            nums[zeroIdex] = nums[nonZeroIndex];
            nums[nonZeroIndex] = tmp;
            zeroIdex++;
            nonZeroIndex++;

        }
    }

    //方法二，遍历两次，定义两个指针j和i，j表明非零的个数，使用i顺序遍历，将非零的个值赋值给
    //nums[j]。第二部将后面的值置为0。

    public static void main(String[] args) {

    }
}
