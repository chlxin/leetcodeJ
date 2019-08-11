package com.linxin.leetcodeJ.solution239;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxSlidingWindow() {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};

        Solution solution = new Solution();
        int[] res = solution.maxSlidingWindow(nums, 3);
        System.out.println(Arrays.toString(res));
    }
}