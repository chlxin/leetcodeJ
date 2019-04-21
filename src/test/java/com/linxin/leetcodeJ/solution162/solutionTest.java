package com.linxin.leetcodeJ.solution162;

import org.junit.Test;

public class solutionTest {

    @Test
    public void findPeakElement() {
        int[] nums = {1, 2, 3, 1};
        Solution solution = new Solution();
        int res = solution.findPeakElement(nums);
        System.out.println(res);
    }
}