package com.linxin.leetcodeJ.solution171;

public class Solution {

    public int titleToNumber(String s) {
        char[] in = s.toCharArray();
        int res = 0;
        for (int i = 0; i < in.length; i++) {
            res += (in[i] - 'A' + 1) * Math.pow(26, in.length - 1 - i);
        }

        return res;
    }

}
