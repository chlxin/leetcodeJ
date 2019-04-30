package com.linxin.leetcodeJ.solution227;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void calculate() {
        Solution solution = new Solution();
        int calculate = solution.calculate("3+2*2");
        System.out.println(calculate);
        assertEquals(7, calculate);
    }

    @Test
    public void calculate2() {
        Solution solution = new Solution();
        int calculate = solution.calculate("3/2");
        System.out.println(calculate);
        assertEquals(1, calculate);
    }

    @Test
    public void calculate3() {
        Solution solution = new Solution();
        int calculate = solution.calculate("3+5 / 2");
        System.out.println(calculate);
        assertEquals(5, calculate);
    }

    @Test
    public void calculate4() {
        Solution solution = new Solution();
        int calculate = solution.calculate("10 + 2 * 3 + 7 / 2 - 2");
        System.out.println(calculate);
        assertEquals(17, calculate);
    }

    @Test
    public void calculate5() {
        Solution solution = new Solution();
        int calculate = solution.calculate("1*2-3/4+5*6-7*8+9/10");
        System.out.println(calculate);
        assertEquals(-24, calculate);
    }

}