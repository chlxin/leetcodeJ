package com.linxin.leetcodeJ.solution268;

public class Solution {

    /**
     * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
     *
     * Example 1:
     *
     * Input: [3,0,1]
     * Output: 2
     * Example 2:
     *
     * Input: [9,6,4,2,3,5,7,0,1]
     * Output: 8
     * Note:
     * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n * (n + 1)) / 2;

        int sum = 0;
        for (int e : nums) {
            sum += e;
        }

        return total - sum;
    }
}
