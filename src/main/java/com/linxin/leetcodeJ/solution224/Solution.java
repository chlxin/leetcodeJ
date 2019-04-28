package com.linxin.leetcodeJ.solution224;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    /**
     * 维护一个操作数的栈和操作符的栈，对操作定义多种优先级
     * @param s 输入的中缀表达式
     * @return
     */
    public int calculate(String s) {
        char[] charArray = s.toCharArray();
        Deque<Character> ops = new LinkedList<>();
        Deque<Integer> nums = new LinkedList<>();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == '(') {
                ops.addLast(c);
            } else if (Character.isDigit(c)) {
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                while (i + 1 < charArray.length && Character.isDigit(charArray[i + 1])) {
                    sb.append(charArray[i + 1]);
                    i++;
                }
                int d = Integer.parseInt(sb.toString());
                nums.addLast(d);
            } else if (c == '+' || c == '-') {
                if (!ops.isEmpty()) {
                    char p = ops.peekLast();
                    // 遇到优先级比自己高或者相同优先级的运算，就把前面的运算都做了
                    if (p == '+' || p == '-') {
                        int b = nums.removeLast();
                        int a = nums.removeLast();
                        char op = ops.removeLast();
                        int res = cal(op, a, b);
                        nums.addLast(res);
                    }
                }
                ops.addLast(c);
            } else if (c == ')') {
                char top = ops.removeLast();
                while (top != '(') {
                    int b = nums.removeLast();
                    int a = nums.removeLast();
                    int res = cal(top, a, b);
                    nums.addLast(res);
                    top = ops.removeLast();
                }
            }
        }
        // 从左往右计算
        while (!ops.isEmpty()) {
            char top = ops.removeFirst();
            int a = nums.removeFirst();
            int b = nums.removeFirst();
            int res = cal(top, a, b);
            nums.addFirst(res);
        }
        return nums.pop();
    }

    private int cal(char c, int a, int b) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
        }
        throw new IllegalArgumentException();
    }

}
