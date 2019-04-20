package com.linxin.leetcodeJ.solution152;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxProduct() {
        int[] nums = {2, 3, -2, 4};
        Solution solution = new Solution();
        int product = solution.maxProduct(nums);
        System.out.println(product);
    }

    @Test
    public void maxProduct2() {
        int[] nums = {-2, 0, -1};
        Solution solution = new Solution();
        int product = solution.maxProduct(nums);
        System.out.println(product);
    }

}