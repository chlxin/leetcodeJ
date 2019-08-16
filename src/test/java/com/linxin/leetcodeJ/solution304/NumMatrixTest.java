package com.linxin.leetcodeJ.solution304;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumMatrixTest {

    @Test
    public void sumRegion() {
        int[][] matrix = {
                new int[]{3, 0, 1, 4, 2},
                new int[]{5, 6, 3, 2, 1},
                new int[]{1, 2, 0, 1, 5},
                new int[]{4, 1, 0, 1, 7},
                new int[]{1, 0, 3, 0, 5}
        };
        NumMatrix m = new NumMatrix(matrix);
        int res1 = m.sumRegion(2, 1, 4, 3);
        System.out.println(res1);

    }
}