package com.linxin.leetcodeJ.solution187;

import java.util.*;

public class Solution {

    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> res = new HashSet<>();

        for (int i = 0; i + 9 < s.length(); i++) {
            String ten = s.substring(i, i + 10);
            if (seen.contains(ten)) {
                res.add(ten);
            }
            seen.add(ten);
        }
        return new ArrayList<>(res);
    }

}
