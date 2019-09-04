package com.linxin.leetcodeJ.solution301;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    private Set<String> validExpression = new HashSet<>();

    private int minimumRemoved = Integer.MAX_VALUE;

    public List<String> removeInvalidParentheses(String s) {
        reset();
        search(s, 0, 0, 0, new StringBuilder(), 0);
        return new ArrayList<>(validExpression);
    }

    private void reset() {
        this.minimumRemoved = Integer.MAX_VALUE;
        validExpression.clear();
    }

    private void search(String s,
                        int index,
                        int leftCount,
                        int rightCount,
                        StringBuilder expression,
                        int removeCount) {
        if (index == s.length()) {
            // handle result
            if (leftCount == rightCount) {
                if (removeCount <= minimumRemoved) {
                    String possibleString = expression.toString();
                    if (removeCount < minimumRemoved) {
                        minimumRemoved = removeCount;
                        validExpression.clear();
                    }
                    validExpression.add(possibleString);
                }
            }
        } else {
            int len = expression.length(); // for restore later
            char currentCharacter = s.charAt(index);
            if (currentCharacter != '(' && currentCharacter != ')') {
                expression.append(currentCharacter);
                search(s, index + 1, leftCount, rightCount, expression, removeCount);
                expression.deleteCharAt(len);
            } else {
                //handle ignore current character
                search(s, index + 1, leftCount, rightCount, expression, removeCount + 1);

                //handle add current character
                expression.append(currentCharacter);
                if (currentCharacter == '(') {
                    search(s, index + 1, leftCount + 1, rightCount, expression, removeCount);
                } else if (rightCount < leftCount) {
                    search(s, index + 1, leftCount, rightCount + 1, expression, removeCount);
                }
                //restore the environment
                expression.deleteCharAt(len);
            }

        }
    }

}
