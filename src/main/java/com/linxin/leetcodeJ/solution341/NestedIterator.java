package com.linxin.leetcodeJ.solution341;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a nested list of integers, implement an iterator to flatten it.
 *
 * Each element is either an integer, or a list -- whose elements may also be integers or other lists.
 *
 * Example 1:
 *
 * Input: [[1,1],2,[1,1]]
 * Output: [1,1,2,1,1]
 * Explanation: By calling next repeatedly until hasNext returns false,
 *              the order of elements returned by next should be: [1,1,2,1,1].
 * Example 2:
 *
 * Input: [1,[4,[6]]]
 * Output: [1,4,6]
 * Explanation: By calling next repeatedly until hasNext returns false,
 *              the order of elements returned by next should be: [1,4,6].
 */
public class NestedIterator implements Iterator<Integer> {

    /**
     * https://leetcode.com/problems/flatten-nested-list-iterator/discuss/80146/Real-iterator-in-Python-Java-C%2B%2B
     * 就目前来看比较满意的答案是上面这个
     * 不会在构造器的时候一次性全部遍历进行数据的复制
     * 维护一个活动栈
     * 每次调用next(),hasNext()满足基本语义，hasNext支持幂等，同时各自均摊下来复杂度都是O(1)， next调用不依赖hasNext
     * 具体的方法非常trick，维护一个活动栈，hasNext保证幂等性，每次调用hasNext不断迭代直到最顶部的元素是Integer
     * next方法中无条件调用一次hasNext做一些预备操作，由于hasNext的幂等性，使得next之前调不调用hasNext都可以
     * 非常牛逼的方法
     */


    private List<Integer> flattenedList;

    private Iterator<Integer> it;

    public NestedIterator(List<NestedInteger> nestedList) {
        flattenedList = new LinkedList<>();
        flatten(nestedList);
        it = flattenedList.iterator();
    }

    private void flatten(List<NestedInteger> nestedIntegerList) {
        for (NestedInteger nestedInteger : nestedIntegerList) {
            if (nestedInteger.isInteger()) {
                flattenedList.add(nestedInteger.getInteger());
            } else {
                flatten(nestedInteger.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return it.next();
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

}
