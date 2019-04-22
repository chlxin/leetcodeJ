package com.linxin.leetcodeJ.solution189;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverse() {
        Solution s = new Solution();
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        s.reverse(nums, 2, 6);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void rotate() {
        Solution s = new Solution();
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        s.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}