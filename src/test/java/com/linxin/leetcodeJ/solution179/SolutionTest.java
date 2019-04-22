package com.linxin.leetcodeJ.solution179;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void largestNumber() {
        Solution s = new Solution();
        int[] nums = {10, 2};
        String s1 = s.largestNumber(nums);
        System.out.println(s1);
    }

    @Test
    public void largestNumber2() {
        Solution s = new Solution();
        int[] nums = {3, 30, 34, 5, 9};
        String s1 = s.largestNumber(nums);
        System.out.println(s1);
    }

    @Test
    public void largestNumber3() {
        Solution s = new Solution();
        int[] nums = {0, 0};
        String s1 = s.largestNumber(nums);
        System.out.println(s1);
    }

    @Test
    public void largestNumber4() {
        Solution s = new Solution();
        int[] nums = {0};
        String s1 = s.largestNumber(nums);
        System.out.println(s1);
    }
}