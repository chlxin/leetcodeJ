package com.linxin.leetcodeJ.solution151;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverseWords() {
        Solution solution = new Solution();
        String res = solution.reverseWords("the sky is blue");
        assertEquals("blue is sky the", res);
    }

    @Test
    public void reverseWords2() {
        Solution solution = new Solution();
        String res = solution.reverseWords("  hello world!  ");
        System.out.println(res);
    }
}