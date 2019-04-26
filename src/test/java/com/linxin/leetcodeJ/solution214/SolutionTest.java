package com.linxin.leetcodeJ.solution214;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        String s = "aacecaaa";
        Solution solution = new Solution();
        boolean palindrome = solution.isPalindrome(s.toCharArray(), 0, s.length() - 2);
        System.out.println(palindrome);
    }

    @Test
    public void shortestPalindrome() {
        String s = "aacecaaa";
        Solution solution = new Solution();
        String shortestPalindrome = solution.shortestPalindrome(s);
        System.out.println(shortestPalindrome);

    }

    @Test
    public void shortestPalindrome2() {
        String s = "abcd";
        Solution solution = new Solution();
        String shortestPalindrome = solution.shortestPalindrome(s);
        System.out.println(shortestPalindrome);

    }

}