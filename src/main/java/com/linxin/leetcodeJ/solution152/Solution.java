package com.linxin.leetcodeJ.solution152;

public class Solution {

    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        // 从左往右扫,从0-i最大的成绩一定出现在，0-i-1的最大值*第i元素或者0-i-1的最小值*第i元素或者第i个元素
        // 原因在于，第i个元素可能为整数也可能为负数，最小值同理
        for (int i = 1; i < n; i++) {
            int temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(min * nums[i], temp * nums[i]), nums[i]);
            if (result < max) {
                result = max;
            }
        }

        return result;
    }

}
