package com.linxin.leetcodeJ.solution228;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void summaryRanges() {
        Solution solution = new Solution();
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> res = solution.summaryRanges(nums);
        System.out.println(res);
        assertEquals("[0->2, 4->5, 7]", res.toString());
    }
}