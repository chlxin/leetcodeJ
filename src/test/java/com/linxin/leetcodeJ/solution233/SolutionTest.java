package com.linxin.leetcodeJ.solution233;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void countDigitOne() {
        Solution solution = new Solution();
        int res = solution.countDigitOne(1234);
        System.out.println(res);
    }

    @Test
    public void countDigitOne2() {
        Solution solution = new Solution();
        int res = solution.countDigitOne(1);
        System.out.println(res);
    }

    @Test
    public void countDigitOne3() {
        Solution solution = new Solution();
        int res = solution.countDigitOne(1410065408);
        System.out.println(res); // should be 1737167499
    }
}