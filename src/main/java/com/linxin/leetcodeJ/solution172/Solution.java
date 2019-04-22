package com.linxin.leetcodeJ.solution172;

public class Solution {

    public int trailingZeroes(int n) {
        int res = 0;
        // n小于5就退出
        for (long i = 5; n / i > 0; i = i * 5) {
            res += n / i;

        }
        return res;
    }

}
