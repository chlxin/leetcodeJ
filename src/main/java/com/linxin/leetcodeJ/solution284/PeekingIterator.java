package com.linxin.leetcodeJ.solution284;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PeekingIterator implements Iterator<Integer> {

    private Integer next;

    private boolean hasNext;

    private Iterator<Integer> iter;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iter = iterator;
        advance();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (!hasNext) {
            throw new NoSuchElementException();
        }
        Integer res = next;
        advance();
        return res;
    }

    @Override
    public boolean hasNext() {
        return hasNext;
    }

    private void advance() {
        if (iter.hasNext()) {
            next = iter.next();
            hasNext = true;
        } else {
            hasNext = false;
        }
    }
}
