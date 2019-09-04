package com.linxin.leetcodeJ.solution301;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void removeInvalidParentheses() {
        Solution solution = new Solution();
        List<String> res = solution.removeInvalidParentheses("(a)())()");
        System.out.println(res);

    }
}