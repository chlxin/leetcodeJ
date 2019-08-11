package com.linxin.leetcodeJ.solution395;

/**
 * Find the length of the longest substring T of a given string (consists of lowercase letters only) such that every character in T appears no less than k times.
 *
 * Example 1:
 *
 * Input:
 * s = "aaabb", k = 3
 *
 * Output:
 * 3
 *
 * The longest substring is "aaa", as 'a' is repeated 3 times.
 * Example 2:
 *
 * Input:
 * s = "ababbc", k = 2
 *
 * Output:
 * 5
 *
 * The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.
 *
 */
public class Solution {

    public int longestSubstring(String s, int k) {
        int res = 0;
        for (int i = 1; i <= 26; i++) {
            res = Math.max(res, longestSubstringNUnique(s, k, i));
        }
        return res;
    }

    private int longestSubstringNUnique(String s, int k, int numUniqueTarget) {
        int[] m = new int[26];
        int numUnique = 0;
        int numNotLessThanK = 0;
        int begin = 0, end = 0;
        int res = 0;
        while (end < s.length()) {
            int idx = s.charAt(end) - 'a';
            if (m[idx] == 0) {
                numUnique++;
            }
            m[idx]++;
            if (m[idx] == k) {
                numNotLessThanK++;
            }
            end++;

            while (numUnique > numUniqueTarget) {
                int bidx = s.charAt(begin) - 'a';
                if (m[bidx] == k) {
                    numNotLessThanK--;
                }
                m[bidx]--;
                if (m[bidx] == 0) {
                    numUnique--;
                }
                begin++;
            }

            if (numUnique == numUniqueTarget && numNotLessThanK == numUnique) {
                res = Math.max(res, end - begin);
            }
        }
        return res;
    }

}
