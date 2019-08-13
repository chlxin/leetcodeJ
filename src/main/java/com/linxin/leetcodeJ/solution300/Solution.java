package com.linxin.leetcodeJ.solution300;

import java.util.Arrays;

/**
 * Given an unsorted array of integers, find the length of longest increasing subsequence.
 *
 * Example:
 *
 * Input: [10,9,2,5,3,7,101,18]
 * Output: 4
 * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 * Note:
 *
 * There may be more than one LIS combination, it is only necessary for you to return the length.
 * Your algorithm should run in O(n2) complexity.
 * Follow up: Could you improve it to O(n log n) time complexity?
 *
 */
public class Solution {

    /**
     * 最长子序列和最基本的几种方法
     *
     */

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int res = 1;
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            int max = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    max = Math.max(max, dp[j] + 1);
                }
            }
            dp[i] = max;
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    /**
     * 时间复杂度O(nlogn)的解法，非常的trick
     * 保存一个dp数组，和一个len的状态量
     * dp的含义可以是: 对于当前遍历的位置，长度为i+1的最长子序列最大的元素(a0,a1,..ai.取ai)，假如有多个长度为i+1，取最小的数
     * dp是一个有序的数组，bound为[0, len)
     * dp中维护的数组的序列并不是最长递增子序列，但是它的长度是最长递增子序列。
     *
     * 遍历的操作:
     * 1. 二分查找到当前值插入的位置(dp中第一个比当前值大的数)
     * 2. 假如插入的位置为len，那么len的长度需要自增
     *
     * 为什么这个算法可以得到最长子序列和的长度?
     * 考虑对dp的两个改变操作，假如二分查找的位置i是在[0, len)之间，我们只是更新第i位置的数字，更新不改变长度信息，因此当前最大的最长子序列和仍然是当前的len，但是在这之后的搜索
     * 可以基于当前dp的信息来盘辅助判断，更新不会改变存在长度为len的最长子序列和的事实
     * 假如nums[i]比dp[0,len)中所有的都大，那么扩充dp长度的唯一方式，这也是一个非常安全的方式，因为在i之前一定存在一个长度为i的递增子序列，最大的数又比当前数小。
     *
     * 更新:
     * 其实每次的遍历对当前值x，先查找位置，假如找到index为k,已知dp[k-1]<x<dp[k]，可知在改index之前，存在长度为k-1+1=k的最长子序列，且最大值为dp[k-1]，可以安全更新dp[k\=x
     * 假如说index已经到了len，那么必须要扩充len。
     * 全程的循环不表式:对于每一次遍历，dp[k]的值为当前最长递增子序列长度为k的的序列中最大的元素，假如存在多个长度为k的序列，那么取最小的。
     *
     * @param nums
     * @return
     */
    public int lengthOfLIS_2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
    }

}
