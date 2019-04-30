package com.linxin.leetcodeJ.solution229;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void majorityElement() {
        int[] nums = {3, 2, 3};
        Solution solution = new Solution();
        List<Integer> list = solution.majorityElement(nums);
        System.out.println(list);
    }

    @Test
    public void majorityElement2() {
        int[] nums = {2, 2, 1, 3};
        Solution solution = new Solution();
        List<Integer> list = solution.majorityElement(nums);
        System.out.println(list);
    }

}