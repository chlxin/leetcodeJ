package com.linxin.leetcodeJ.solution205;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isIsomorphic() {
        Solution solution = new Solution();
        boolean isomorphic = solution.isIsomorphic("egg", "add");
        System.out.println(isomorphic);
    }

    @Test
    public void isIsomorphic2() {
        Solution solution = new Solution();
        boolean isomorphic = solution.isIsomorphic("foo", "bar");
        System.out.println(isomorphic);
    }

    @Test
    public void isIsomorphic3() {
        Solution solution = new Solution();
        boolean isomorphic = solution.isIsomorphic("ab", "aa");
        System.out.println(isomorphic);
    }

}