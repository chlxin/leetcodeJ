package com.linxin.leetcodeJ.solution232;

import java.util.Deque;
import java.util.LinkedList;

public class MyQueue {

    private Deque<Integer> stack = new LinkedList<>();

    private Deque<Integer> backup = new LinkedList<>();

    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new LinkedList<>();
        backup = new LinkedList<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!stack.isEmpty()) {
            backup.push(stack.pop());
        }
        stack.push(x);
        while (!backup.isEmpty()) {
            stack.push(backup.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();
    }

    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }

}
