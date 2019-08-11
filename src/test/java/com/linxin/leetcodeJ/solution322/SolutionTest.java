package com.linxin.leetcodeJ.solution322;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void coinChange_case1() {
        int[] coins = new int[]{1, 2, 5};
        Solution solution = new Solution();
        int res = solution.coinChange(coins, 11);
        System.out.println(res);
    }

    @Test
    public void coinChange_case2() {
        int[] coins = new int[]{2};
        Solution solution = new Solution();
        int res = solution.coinChange(coins, 3);
        System.out.println(res);
    }

}