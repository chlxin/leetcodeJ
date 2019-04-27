package com.linxin.leetcodeJ.solution209;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minSubArrayLen() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int s = 7;
        Solution solution = new Solution();
        int minSubArrayLen = solution.minSubArrayLen(s, nums);
        System.out.println(minSubArrayLen);
    }
}