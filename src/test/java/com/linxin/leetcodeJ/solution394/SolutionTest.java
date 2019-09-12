package com.linxin.leetcodeJ.solution394;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void decodeString() {
        Solution solution = new Solution();
        String res = solution.decodeString("2[abc]3[cd]ef");
        System.out.println(res);
    }

    @Test
    public void decodeString2() {
        Solution solution = new Solution();
        String res = solution.decodeString("100[leetcode]");
        System.out.println(res);
    }

}