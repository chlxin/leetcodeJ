package com.linxin.leetcodeJ.solution295;

import java.util.*;

/**
 * Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.
 * <p>
 * For example,
 * [2,3,4], the median is 3
 * <p>
 * [2,3], the median is (2 + 3) / 2 = 2.5
 * <p>
 * Design a data structure that supports the following two operations:
 * <p>
 * void addNum(int num) - Add a integer number from the data stream to the data structure.
 * double findMedian() - Return the median of all elements so far.
 * <p>
 * <p>
 * Example:
 * <p>
 * addNum(1)
 * addNum(2)
 * findMedian() -> 1.5
 * addNum(3)
 * findMedian() -> 2
 * <p>
 * <p>
 * Follow up:
 * <p>
 * If all integer numbers from the stream are between 0 and 100, how would you optimize it?
 * If 99% of all integer numbers from the stream are between 0 and 100, how would you optimize it?
 */
public class MedianFinder {

    /**
     * 把序列分成两段
     * small为前半段，为大顶堆，取出来是最大的那个数
     * large为后半段，为小顶堆，取出来是最小那个数
     */
    private PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> large = new PriorityQueue<>();

    /**
     * 冗余字段，其实可以从small.size() + large.size()求得，但是方便
     */
    private boolean even = true;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {

    }

    public void addNum(int num) {
        if (even) {
            large.offer(num);
            small.offer(large.poll());
        } else {
            small.offer(num);
            large.offer(small.poll());
        }
        even = !even;
    }

    public double findMedian() {
        double res;
        if (even) {
            int n1 = small.peek() != null ? small.peek() : 0;
            int n2 = large.peek() != null ? large.peek() : 0;
            res = (n1 + n2) * 0.5;
        } else {
            res = small.peek() != null ? small.peek() : 0;
        }
        return res;
    }

}
