package com.linxin.leetcodeJ.solution347;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void topKFrequent() {
        int[] nums = new int[]{1, 2};
        Solution solution = new Solution();
        List<Integer> res = solution.topKFrequent(nums, 2);
        System.out.println(res);
    }
}