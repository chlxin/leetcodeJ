package com.linxin.leetcodeJ.solution378;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void kthSmallest() {
        int[][] matrix = {
                {-5}
        };

        Solution solution = new Solution();
        int res = solution.kthSmallest(matrix, 1);
        System.out.println(res);
    }
}