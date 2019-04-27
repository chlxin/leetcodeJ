package com.linxin.leetcodeJ.solution329;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestIncreasingPath() {
        int[][] nums = {
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}
        };
        Solution s = new Solution();
        int path = s.longestIncreasingPath(nums);
        System.out.println(path);
    }
}