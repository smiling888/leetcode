package com.lzh.array;

/**
 * @author jiuxing.lzh
 * Date: 2021/3/28
 **/
public class L560subarraySum {

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int slow = 0, fast = 0;
        int sum = 0;
        boolean addFast = true;
        while (slow < nums.length && fast < nums.length) {
            if (addFast) {
                sum += nums[fast];
            }
            if (sum == k) {
                sum = sum - nums[slow];
                slow++;
                count++;
                addFast = false;
            } else if (sum < k) {
                fast++;
                addFast = true;
            } else {
                sum = sum - nums[slow];
                slow++;
                addFast = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new L560subarraySum().subarraySum(new int[]{-1, -1, 1}, 0));
    }
}
