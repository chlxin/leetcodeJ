package com.linxin.leetcodeJ.solution301;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2 {

    private Set<String> validExpressions = new HashSet<String>();

    public List<String> removeInvalidParentheses(String s) {
        int left = 0, right = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else if (s.charAt(i) == ')') {
                right = left == 0 ? right + 1 : right;
                left = left > 0 ? left - 1 : left;
            }
        }

        recurse(s, 0, 0, 0, left, right, new StringBuilder());
        return new ArrayList<>(validExpressions);
    }

    private void recurse(
            String s,
            int index,
            int leftCount,
            int rightCount,
            int leftRem,
            int rightRem,
            StringBuilder expression) {
        if (index == s.length()) {
            if (leftRem == 0 && rightRem == 0) {
                this.validExpressions.add(expression.toString());
            }
        } else {
            int len = expression.length();
            char currentCharacter = s.charAt(index);

            if ((currentCharacter == '(' && leftRem > 0) ||
                    (currentCharacter == ')' && rightRem > 0)) {
                recurse(s,
                        index + 1,
                        leftCount,
                        rightCount,
                        leftRem - (currentCharacter == '(' ? 1 : 0),
                        rightRem - (currentCharacter == ')' ? 1 : 0),
                        expression);
            }

            expression.append(currentCharacter);
            if (currentCharacter != '(' && currentCharacter != ')') {
                recurse(s, index + 1, leftCount, rightCount, leftRem, rightRem, expression);
            } else if (currentCharacter == '(') {
                recurse(s, index + 1, leftCount + 1, rightCount, leftRem, rightRem, expression);
            } else if (rightCount < leftCount) {
                recurse(s, index + 1, leftCount, rightCount + 1, leftRem, rightRem, expression);
            }
            expression.deleteCharAt(len);
        }
    }
}
