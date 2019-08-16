package com.linxin.leetcodeJ.solution315;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void countSmaller_2() {
        int[] nums = new int[]{5, 2, 6, 1};
        Solution solution = new Solution();
        List<Integer> res = solution.countSmaller_2(nums);
        System.out.println(res);
    }

    @Test
    public void countSmaller_2_2() {
        int[] nums = new int[]{0, 2, 1};
        Solution solution = new Solution();
        List<Integer> res = solution.countSmaller_2(nums);
        System.out.println(res);
    }
}