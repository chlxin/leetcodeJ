package com.linxin.leetcodeJ.solution215;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findKthLargest() {
        int[] nums = new int[]{3,2,1,5,6,4};

        Solution solution = new Solution();
        int res = solution.findKthLargest(nums, 2);
        System.out.println(res);
    }

    @Test
    public void findKthLargest2() {
        int[] nums = new int[]{2, 1};

        Solution solution = new Solution();
        int res = solution.findKthLargest(nums, 1);
        System.out.println(res);
    }
}