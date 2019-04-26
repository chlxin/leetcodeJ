package com.linxin.leetcodeJ.solution220;

import java.util.TreeSet;

public class Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }

        TreeSet<Long> windows = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            Long floor = windows.floor((long) (nums[i] + t));
            Long ceil = windows.ceiling((long) nums[i] - t);
            if ((floor != null && floor >= nums[i]) ||
                    (ceil != null && ceil <= nums[i])) {
                return true;
            }
            windows.add((long) nums[i]);
            if (i >= k) {
                windows.remove((long) nums[i - k]);
            }
        }

        return false;
    }

}
