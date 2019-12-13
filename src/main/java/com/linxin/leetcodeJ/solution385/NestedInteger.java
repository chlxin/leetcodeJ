package com.linxin.leetcodeJ.solution385;

import java.util.LinkedList;
import java.util.List;

public class NestedInteger {

    private Integer value;

    private List<NestedInteger> nestLists;

    public NestedInteger() {}

    // Constructor initializes a single integer.
    public NestedInteger(int value) {
        this.value = value;
    }

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    boolean isInteger() {
        return value != null;
    }

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    Integer getInteger() {
        return value;
    }

    // Set this NestedInteger to hold a single integer.
    void setInteger(int value) {
        this.value = value;
    }

    // Set this NestedInteger to hold a nested list and adds a nested integer to it.
    void add(NestedInteger ni) {
        if (nestLists == null) {
            nestLists = new LinkedList<>();
        }
        nestLists.add(ni);
    }

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    List<NestedInteger> getList() {
        return nestLists;
    }

}
