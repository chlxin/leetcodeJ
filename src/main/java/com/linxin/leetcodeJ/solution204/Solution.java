package com.linxin.leetcodeJ.solution204;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int countPrimes(int n) {
        boolean[] s = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!s[i]) {
                count++;
                for (int k = 2; i * k < n; k++) {
                    s[i * k] = true;
                }
            }

        }
        return count;
    }

    // 太慢了
    public int countPrimes2(int n) {
        Set<Integer> s = new HashSet<>();
        for (int i = 2; i < n; i++) {
            s.add(i);
        }

        int sqrt = (int) Math.sqrt(n);

        for (int i = 2; i <= sqrt; i++) {
            for (int k = 2; i * k < n; k++) {
                s.remove(i * k);
            }
        }
        return s.size();
    }

}
