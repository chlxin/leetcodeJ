package com.linxin.leetcodeJ.solution324;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void wiggleSort() {
        int[] nums = {1, 5, 1, 1, 6, 4};
        Solution solution = new Solution();
        solution.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void example1() {
        int n = 7;
        for (int i = 0; i < n; i++) {
            System.out.println(A(i, n));
        }
    }

    private int A(int i, int n) {
        return (1 + 2 * i) % (n | 1);
    }
}