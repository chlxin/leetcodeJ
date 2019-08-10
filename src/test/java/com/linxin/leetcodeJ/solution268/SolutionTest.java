package com.linxin.leetcodeJ.solution268;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void missingNumber() {
        int[] nums = new int[]{3, 0, 1};

        Solution solution = new Solution();
        int res = solution.missingNumber(nums);
        System.out.println(res);

    }
}