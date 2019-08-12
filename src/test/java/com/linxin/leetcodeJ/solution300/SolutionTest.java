package com.linxin.leetcodeJ.solution300;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lengthOfLIS() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        Solution solution = new Solution();
        int res = solution.lengthOfLIS(nums);
        System.out.println(res);

    }
}