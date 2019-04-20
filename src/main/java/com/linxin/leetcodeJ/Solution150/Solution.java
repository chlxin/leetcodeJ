package com.linxin.leetcodeJ.Solution150;

import java.util.*;

public class Solution {

    public int evalRPN(String[] tokens) {
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }
        Deque<String> s = new LinkedList<>();
        Set<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        int res = 0;
        for (String token : tokens) {
            if (operators.contains(token)) {
                int a = Integer.parseInt(s.pop());
                int b = Integer.parseInt(s.pop());
                res = help(token, b, a);
                s.push(String.valueOf(res));
            } else {
                s.push(token);
            }
        }

        return res;
    }

    private int help(String operator, int a, int b) {
        int res = 0;
        if ("+".equals(operator)) {
            res = a + b;
        } else if ("-".equals(operator)) {
            res = a -b;
        } else if ("*".equals(operator)) {
            res = a * b;
        } else if ("/".equals(operator)) {
            res = a / b;
        } else {
            throw new IllegalArgumentException(operator);
        }
        return res;
    }

}
