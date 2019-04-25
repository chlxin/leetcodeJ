package com.linxin.leetcodeJ.solution213;

public class Solution {

    public int rob(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return n == 1 ? nums[0] : 0;
        }
        return Math.max(robber(nums, 0, n - 2), robber(nums, 1, n - 1));
    }

    private int robber(int[] nums, int l, int r) {
        int pre = 0, cur = 0;
        for (int i = l; i <= r; i++) {
            int tmp = Math.max(pre + nums[i], cur);
            pre = cur;
            cur = tmp;
        }
        return cur;
    }

}
