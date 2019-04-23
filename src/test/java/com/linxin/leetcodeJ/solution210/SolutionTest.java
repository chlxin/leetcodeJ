package com.linxin.leetcodeJ.solution210;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findOrder() {
        Solution s = new Solution();
        int[][] pres = {
                {1, 0},
                {2, 0},
                {3, 1},
                {3, 2},
        };
        int[] order = s.findOrder(4, pres);
        System.out.println(Arrays.toString(order));
    }

    @Test
    public void findOrder2() {
        Solution s = new Solution();
        int[][] pres = {
                {1, 0},

        };
        int[] order = s.findOrder(2, pres);
        System.out.println(Arrays.toString(order));
    }
}