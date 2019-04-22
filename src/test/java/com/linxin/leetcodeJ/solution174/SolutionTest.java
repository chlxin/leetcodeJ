package com.linxin.leetcodeJ.solution174;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void calculateMinimumHP() {
        Solution s = new Solution();
        int[][] dungeon = {
                {-2, -3, 3},
                {-5, -10, 1},
                {10, 30, -5},
        };
        int res = s.calculateMinimumHP(dungeon);
        System.out.println(res);
    }
}