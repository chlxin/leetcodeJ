package com.linxin.leetcodeJ.solution397;

/**
 * Given a positive integer n and you can do operations as follow:
 * <p>
 * If n is even, replace n with n/2.
 * If n is odd, you can replace n with either n + 1 or n - 1.
 * What is the minimum number of replacements needed for n to become 1?
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 8
 * <p>
 * Output:
 * 3
 * <p>
 * Explanation:
 * 8 -> 4 -> 2 -> 1
 * Example 2:
 * <p>
 * Input:
 * 7
 * <p>
 * Output:
 * 4
 * <p>
 * Explanation:
 * 7 -> 8 -> 4 -> 2 -> 1
 * or
 * 7 -> 6 -> 3 -> 2 -> 1
 */
public class Solution {

    /**
     * Theorem to prove:
     * For any odd number k >= 3, f(k-1) <= f(k) and f(k+1) <= f(k), where f denotes "integerReplacement(int n)".
     * In another words, for two adjacent numbers the even one needs less or equal steps to get to 1 than that of the odd one.
     * <p>
     * This can be proven by induction:
     * <p>
     * for 2,3,4,5,6 we have f(2) = 1, f(3) = 2, f(4) = 2, f(5) = 3, f(6) = 3 which agree with the statement
     * for and odd number k let's prove f(k-1) <= f(k) (f(k+1) < f(k) can be proven in the same manner):
     * for k-1: k-1 -> (k-1)/2
     * for k: a. k -> k-1 -> (k-1)/2 OR
     * b. k -> k+1->(k+1)/2
     * if we take path a, it's obvious that k takes one more step than k-1 to get (k-1)/2 so f(k-1) < f(k)
     * if we take path b,
     * if (k+1)/2 is even and (k-1)/2 is odd, then for k-1 we can also take two step to reach (k+1)/2 by k-1 -> (k-1)/2 - > (k+1)/2, so f(k-1) = f(k)
     * if (k+1)/2 is odd number, by induction we know f[(k-1)/2] <= f[(k+1)/2], so overall f(k-1) < f(k) (because it takes one step from k-1 to (k-1)/2 but two steps from k to (k+1)/2)
     * So in all the cases f(k-1) <= f(k)
     * Corollary:
     * For our problem: if we have an odd number we need increase or decrease to make it be 4n. The reason is for an odd number after two steps it could become an odd or even number differed by 1 and the theorm above tell us you better become an even number after two steps.
     * Why 3 is an exception? The theorem only applies for odd numbers >= 3 because f(2) > f(1) is an exception!!
     */


    public int integerReplacement(int n) {
        if (n == Integer.MAX_VALUE) {
            return 32;
        }
        if (n <= 2) {
            return n - 1;
        } else if (n == 3) {
            return 2;
        } else if (n % 2 == 0) {
            return integerReplacement(n / 2) + 1;
        } else {
            return (n & 2) == 0 ? integerReplacement(n - 1) + 1 : integerReplacement(n + 1) + 1; //本质上凑4比较合算
        }
    }

}
