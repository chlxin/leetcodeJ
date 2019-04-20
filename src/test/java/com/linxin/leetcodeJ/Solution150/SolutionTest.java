package com.linxin.leetcodeJ.Solution150;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void evalRPN() {
        String[] s = {"2", "1", "+", "3", "*"};
        Solution solution = new Solution();
        int res = solution.evalRPN(s);
        System.out.println(res);
    }
}