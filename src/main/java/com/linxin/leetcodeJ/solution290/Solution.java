package com.linxin.leetcodeJ.solution290;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");
        if (arr.length != pattern.length()) {
            return false;
        }
        String[] dic = new String[26];
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            char c = pattern.charAt(i);
            if (dic[c - 'a'] != null) {
                if (!dic[c - 'a'].equals(arr[i])) {
                    return false;
                }
            } else {
                if (set.contains(arr[i])) {
                    return false;
                }
                set.add(arr[i]);
                dic[c - 'a'] = arr[i];
            }
        }
        return true;
    }

}
