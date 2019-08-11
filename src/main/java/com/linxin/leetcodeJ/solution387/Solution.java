package com.linxin.leetcodeJ.solution387;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 *
 * Examples:
 *
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 *
 */
public class Solution {

    public int firstUniqChar(String s) {
        int[] dic = new int[26];
        char[] cs = s.toCharArray();
        for (char c : cs) {
            dic[c - 'a']++;
        }
        for (int i = 0; i< cs.length;i++) {
            if (dic[cs[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

}
