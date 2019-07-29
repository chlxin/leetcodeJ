package com.linxin.leetcodeJ.solution238;

public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];

        ans[0] = 1;
        for (int i = 1; i < length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int r = 1;
        for (int i = length - 1; i >= 0; i--) {
            ans[i] = ans[i] * r;
            r = r * nums[i];
        }

        return ans;
    }

}
