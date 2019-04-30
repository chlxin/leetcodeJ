package com.linxin.leetcodeJ.solution227;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    public int calculate(String s) {
        char[] charArray = s.toCharArray();
        Deque<Integer> nums = new LinkedList<>();
        Deque<Character> ops = new LinkedList<>();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isDigit(c)) {
                int x = c - '0';
                while (i + 1 < charArray.length && Character.isDigit(charArray[i + 1])) {
                    x *= 10;
                    x += charArray[i + 1] - '0';
                    i++;
                }
                nums.addLast(x);
            } else if (c == '*' || c == '/') {
                // 遇到优先级比自己高或者相同优先级的运算，就把前面的运算都做了
                if (!ops.isEmpty()) {
                    char p = ops.peekLast();
                    // 遇到优先级比自己高或者相同优先级的运算，就把前面的运算都做了
                    if (p == '*' || p == '/') {
                        int b = nums.removeLast();
                        int a = nums.removeLast();
                        char op = ops.removeLast();
                        int res = cal(op, a, b);
                        nums.addLast(res);
                    }
                }
                ops.addLast(c);
            } else if (c == '+' || c == '-') {
                if (!ops.isEmpty()) {
                    char p = ops.peekLast();
                    while (p == '*' || p == '/' || p == '+' || p == '-') {
                        int b = nums.removeLast();
                        int a = nums.removeLast();
                        char op = ops.removeLast();
                        int res = cal(op, a, b);
                        nums.addLast(res);
                        if (ops.isEmpty()) {
                            break;
                        }
                        p = ops.peekLast();
                    }
                }
                ops.addLast(c);
            }
        }

        while (!ops.isEmpty()) {
            int b = nums.removeLast();
            int a = nums.removeLast();
            char op = ops.removeLast();
            int res = cal(op, a, b);
            nums.addLast(res);
        }
        return nums.pop();
    }

    private int cal(char c, int a, int b) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        throw new IllegalArgumentException();
    }

}
