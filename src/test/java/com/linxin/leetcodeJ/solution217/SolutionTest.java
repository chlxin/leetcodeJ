package com.linxin.leetcodeJ.solution217;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void containsDuplicate() {
        int[] nums = {1, 2, 3, 1};
        Solution s = new Solution();
        boolean res = s.containsDuplicate(nums);
        System.out.println(res);
    }
}