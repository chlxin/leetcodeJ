package com.linxin.leetcodeJ.solution169;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int res = 0;
        for (int n : nums) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
            if (map.get(n) > (nums.length / 2)) {
                res = n;
                break;
            }
        }
        return res;
    }

}
