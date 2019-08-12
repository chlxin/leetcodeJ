package com.linxin.leetcodeJ.solution326;

/**
 * Given an integer, write a function to determine if it is a power of three.
 *
 * Example 1:
 *
 * Input: 27
 * Output: true
 * Example 2:
 *
 * Input: 0
 * Output: false
 * Example 3:
 *
 * Input: 9
 * Output: true
 * Example 4:
 *
 * Input: 45
 * Output: false
 * Follow up:
 * Could you do it without using any loop / recursion?
 *
 */
public class Solution {

    /**
     * 使用的是循环迭代的方式
     * follow up 中问可不可以不用迭代的方式，有一种比较trick的方式由于int中最大只能表达3^19,因此。可以用3^19能否整除n来判断
     * @param n
     * @return
     */
    public boolean isPowerOfThree(int n) {
        int base = 1;

        while (base <= n) {
            if (base == n) {
                return true;
            }
            base *= 3;
            if (base < 0) { // overflow
                break;
            }
        }

        return false;
    }

}
