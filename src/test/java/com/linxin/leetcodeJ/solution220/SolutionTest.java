package com.linxin.leetcodeJ.solution220;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void containsNearbyAlmostDuplicate() {
        Solution s = new Solution();
        int[] nums = {1, 5, 9, 1, 5, 9};
        boolean res = s.containsNearbyAlmostDuplicate(nums, 2, 3);
        System.out.println(res);
    }

    @Test
    public void containsNearbyAlmostDuplicate2() {
        Solution s = new Solution();
        int[] nums = {-2147483648,-2147483647};
        boolean res = s.containsNearbyAlmostDuplicate(nums, 3, 3);
        System.out.println(res);
    }
}