package com.linxin.leetcodeJ.solution306;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isAdditiveNumber() {
        Solution solution = new Solution();
        boolean additiveNumber = solution.isAdditiveNumber("198019823962");
        System.out.println(additiveNumber);
    }

    @Test
    public void isAdditiveNumber2() {
        Solution solution = new Solution();
        boolean additiveNumber = solution.isAdditiveNumber("111122335588143");
        System.out.println(additiveNumber);
    }

    @Test
    public void isAdditiveNumber3() {
        Solution solution = new Solution();
        boolean additiveNumber = solution.isAdditiveNumber("1023");
        System.out.println(additiveNumber);
    }

    @Test
    public void isAdditiveNumber4() {
        Solution solution = new Solution();
        boolean additiveNumber = solution.isAdditiveNumber("121474836472147483648");
        System.out.println(additiveNumber);
    }
}