package com.linxin.leetcodeJ.solution224;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void calculate() {
        Solution solution = new Solution();
        int res = solution.calculate("(1+(4+5+2)-3)+(6+8)");
        System.out.println(res);
        assertEquals(23, res);
    }

    @Test
    public void calculate2() {
        Solution solution = new Solution();
        int res = solution.calculate("1 + 1");
        System.out.println(res);
        assertEquals(2, res);
    }

    @Test
    public void calculate3() {
        Solution solution = new Solution();
        int res = solution.calculate("2 -1 + 2");
        System.out.println(res);
        assertEquals(3, res);
    }

    @Test
    public void calculate4() {
        Solution solution = new Solution();
        int res = solution.calculate("2147483647");
        System.out.println(res);
        assertEquals(2147483647, res);
    }

    @Test
    public void calculate5() {
        Solution solution = new Solution();
        int res = solution.calculate("12 + 3");
        System.out.println(res);
        assertEquals(15, res);
    }

    @Test
    public void calculate6() {
        Solution solution = new Solution();
        int res = solution.calculate("12 + 3 - 7 + 2");
        System.out.println(res);
        assertEquals(10, res);
    }

    @Test
    public void calculate7() {
        Solution solution = new Solution();
        int res = solution.calculate("2-4-(8+2-6+(8+4-(1)+8-10))");
        System.out.println(res);
        assertEquals(-15, res);
    }

}