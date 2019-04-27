package com.linxin.leetcodeJ.solution209;

public class Solution {

    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        int[][] dp = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            int total = 0, j = i;
            if (i > 0) {
                total = dp[i - 1][1] - nums[i - 1];
                j = i - 1 + dp[i - 1][0];
            }
            while (j < nums.length && total < s) {
                total += nums[j];
                j++;
            }
            if (j >= nums.length && total < s) {
                break;
            }
            dp[i][0] = j - i;
            dp[i][1] = total;
            res = Math.min(res, dp[i][0]);
        }
        if (res == Integer.MAX_VALUE) {
            return 0;
        }
        return res;
    }

}
