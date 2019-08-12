package com.linxin.leetcodeJ.solution326;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPowerOfThree() {
        Solution solution = new Solution();
        boolean res = solution.isPowerOfThree(27);
        System.out.println(res);
    }

    @Test
    public void isPowerOfThree2() {
        Solution solution = new Solution();
        boolean res = solution.isPowerOfThree(2147483647);
        System.out.println(res);
    }
}