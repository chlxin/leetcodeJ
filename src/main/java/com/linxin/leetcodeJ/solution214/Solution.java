package com.linxin.leetcodeJ.solution214;

public class Solution {

    public String shortestPalindrome(String s) {
        char[] cs = s.toCharArray();

        int index = cs.length - 1;
        while (index >= 0) {
            if (isPalindrome(cs, 0, index)) {
                break;
            }
            index--;
        }
        StringBuilder sb = new StringBuilder();
        index++;
        while (index < cs.length) {
            sb.insert(0, cs[index]);
            index++;
        }
        sb.append(s);
        return sb.toString();
    }

    public boolean isPalindrome(char[] cs, int start, int end) {
        int diff = end - start;
        for (int i = 0; i <= diff / 2; i++) {
            if (cs[start + i] != cs[end - i]) {
                return false;
            }
        }
        return true;
    }

}
