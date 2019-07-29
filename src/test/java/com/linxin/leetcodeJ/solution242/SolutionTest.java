package com.linxin.leetcodeJ.solution242;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isAnagram() {
        Solution solution = new Solution();
        boolean anagram = solution.isAnagram("a", "b");
        System.out.println(anagram);
    }
}