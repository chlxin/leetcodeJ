package com.linxin.leetcodeJ.solution217;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x: nums) {
            if (set.contains(x)) {
                return true;
            } else {
                set.add(x);
            }
        }
        return false;
    }

}
