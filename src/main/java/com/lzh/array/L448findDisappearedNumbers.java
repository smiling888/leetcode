package com.lzh.array;

import java.util.ArrayList;
import java.util.List;

/******************************************************
 * @Date: 2021-02-08
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L448findDisappearedNumbers {

    /**
     * https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
     * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
     *
     * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
     *
     * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
     *
     * 空间复杂O(1)和时间复杂度O（n）。只能原地修改数据
     * @param nums
     * @return
     */
//    我们可以用一个哈希表记录数组 \textit{nums}nums 中的数字，由于数字范围均在 [1,n][1,n] 中，记录数字后我们再利用哈希表检查 [1,n][1,n] 中的每一个数是否出现，从而找到缺失的数字。
//
//    由于数字范围均在 [1,n][1,n] 中，我们也可以用一个长度为 nn 的数组来代替哈希表。这一做法的空间复杂度是 O(n)O(n) 的。我们的目标是优化空间复杂度到 O(1)O(1)。
//
//    注意到 \textit{nums}nums 的长度恰好也为 nn，能否让 \textit{nums}nums 充当哈希表呢？
//
//    由于 \textit{nums}nums 的数字范围均在 [1,n][1,n] 中，我们可以利用这一范围之外的数字，来表达「是否存在」的含义。
//
//    具体来说，遍历 \textit{nums}nums，每遇到一个数 xx，就让 \textit{nums}[x-1]nums[x−1] 增加 nn。由于 \textit{nums}nums 中所有数均在 [1,n][1,n] 中，增加以后，这些数必然大于 nn。最后我们遍历 \textit{nums}nums，若 \textit{nums}[i]nums[i] 未大于 nn，就说明没有遇到过数 i+1i+1。这样我们就找到了缺失的数字。
//
//    注意，当我们遍历到某个位置时，其中的数可能已经被增加过，因此需要对 nn 取模来还原出它本来的值。
//
//
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            int index = (nums[i] > 0 ? nums[i] : -nums[i]) - 1;
            int data = nums[index];
            nums[index] = data < 0 ? data : -data;

        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        new L448findDisappearedNumbers()
                .findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1
                });
    }
}
