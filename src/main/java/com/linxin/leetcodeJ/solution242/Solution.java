package com.linxin.leetcodeJ.solution242;

public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] dic = new int[26];
        for (int i = 0; i < s.length(); i++) {
            dic[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            dic[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (dic[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
