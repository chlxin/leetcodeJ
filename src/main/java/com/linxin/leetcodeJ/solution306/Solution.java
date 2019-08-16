package com.linxin.leetcodeJ.solution306;

import java.math.BigInteger;

/**
 * Additive number is a string whose digits can form additive sequence.
 * <p>
 * A valid additive sequence should contain at least three numbers. Except for the first two numbers, each subsequent number in the sequence must be the sum of the preceding two.
 * <p>
 * Given a string containing only digits '0'-'9', write a function to determine if it's an additive number.
 * <p>
 * Note: Numbers in the additive sequence cannot have leading zeros, so sequence 1, 2, 03 or 1, 02, 3 is invalid.
 * <p>
 * Example 1:
 * <p>
 * Input: "112358"
 * Output: true
 * Explanation: The digits can form an additive sequence: 1, 1, 2, 3, 5, 8.
 * 1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
 * Example 2:
 * <p>
 * Input: "199100199"
 * Output: true
 * Explanation: The additive sequence is: 1, 99, 100, 199.
 * 1 + 99 = 100, 99 + 100 = 199
 * Follow up:
 * How would you handle overflow for very large input integers?
 */
public class Solution {

    public boolean isAdditiveNumber(String num) {
        int len = num.length();
        for (int i = 1; i <= len/2; i++) { // i的范围在[0,len/2]之间，很好理解
            for (int j = i + 1; j < len; j++) {
                String s1 = num.substring(0, i);
                String s2 = num.substring(i, j);
                BigInteger a = new BigInteger(s1); // 必须使用BigInteger，否则会出现溢出的一些整数
                BigInteger b = new BigInteger(s2);


                if (!a.toString().equals(s1) || !b.toString().equals(s2)) { // 这一步不能省，方式012这种字符串的干扰
                    continue;
                }

                int k = j;
                while (k < len) {
                    BigInteger c = a.add(b);
                    String cStr = c.toString();
                    if (!num.startsWith(cStr, k)) {
                        break;
                    }
                    k += cStr.length();
                    a = b;
                    b = c;
                }
                if (k == len) {
                    return true;
                }
            }
        }
        return false;
    }


}
