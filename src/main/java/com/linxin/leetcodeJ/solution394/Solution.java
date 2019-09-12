package com.linxin.leetcodeJ.solution394;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    public String decodeString(String s) {
        Deque<Integer> countStack = new LinkedList<>();
        Deque<String> resStack = new LinkedList<>();
        String res = "";
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                int count = 0;
                while (c >= '0' && c <= '9') {
                    count = count * 10 + (c - '0');
                    // should consider count overflow?
                    i++;
                    c = s.charAt(i);
                }
                countStack.push(count);
            } else if (c == '[') {
                resStack.push(res);
                res = "";
                i++;
            } else if (c == ']') {
                int k = countStack.pop();
                String s0 = resStack.pop();
                res = s0 + repeat(k, res);
                i++;
            } else {
                res += c;
                i++;
            }
        }

        return res;
    }

    private String repeat(int k, String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

}
