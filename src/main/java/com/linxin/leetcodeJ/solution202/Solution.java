package com.linxin.leetcodeJ.solution202;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while (s.add(n)) {
            int cal = cal(n);
            if (cal == 1) {
                return true;
            }
            n = cal;
        }
        return false;
    }

    private int cal(int n) {
        int res = 0;
        while (n > 0) {
            int t = n % 10;
            res += t * t;
            n /= 10;
        }
        return res;
    }

}
