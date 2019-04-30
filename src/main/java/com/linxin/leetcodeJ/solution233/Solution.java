package com.linxin.leetcodeJ.solution233;

public class Solution {


    public int countDigitOne(int n) {
        if (n <= 0) {
            return 0;
        }

        int sum = 0;
        long m = 1;

        while (m <= n) {
            long base10 = 10 * m;

            sum += (n / base10) * m + Math.min(Math.max(n % base10 - m + 1, 0), m);
            m *= 10;
        }

        return sum;
    }

}
