package com.linxin.leetcodeJ.solution189;

public class Solution {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int pivot = nums.length - k;
        reverse(nums, 0, pivot - 1);
        reverse(nums, pivot, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        for (int i = start; i <= mid; i++) {
            int tmp = nums[i];
            nums[i] = nums[start + end - i];
            nums[start + end - i] = tmp;
        }
    }

}
