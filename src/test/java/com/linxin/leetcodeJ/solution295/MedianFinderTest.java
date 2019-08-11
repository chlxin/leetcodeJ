package com.linxin.leetcodeJ.solution295;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedianFinderTest {

    @Test
    public void findMedian() {
        MedianFinder finder = new MedianFinder();
        finder.addNum(2);
        finder.addNum(3);
        System.out.println(finder.findMedian());
        finder.addNum(4);
        System.out.println(finder.findMedian());
    }

    @Test
    public void findMedian2() {
        MedianFinder finder = new MedianFinder();
        finder.addNum(-1);
        finder.addNum(-2);
        System.out.println(finder.findMedian());
        finder.addNum(-3);
        System.out.println(finder.findMedian());
    }
}