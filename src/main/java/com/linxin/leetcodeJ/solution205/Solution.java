package com.linxin.leetcodeJ.solution205;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    // 这个解法挺不好的
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if ((map1.get(s.charAt(i)) != null && map1.get(s.charAt(i)) != t.charAt(i))
                    || (map2.get(t.charAt(i)) != null && map2.get(t.charAt(i)) != s.charAt(i))) {
                return false;
            }

            if (map1.get(s.charAt(i)) == null) {
                map1.put(s.charAt(i), t.charAt(i));
            }

            if (map2.get(t.charAt(i)) == null) {
                map2.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }

}
