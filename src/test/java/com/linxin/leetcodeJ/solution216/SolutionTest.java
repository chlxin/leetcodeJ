package com.linxin.leetcodeJ.solution216;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void combinationSum3() {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.combinationSum3(3, 7);
        System.out.println(lists);
    }
}