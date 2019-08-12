package com.linxin.leetcodeJ.solution380;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomizedSetTest {

    @Test
    public void example1() {
        RandomizedSet obj = new RandomizedSet();
        boolean param1 = obj.insert(10);
        boolean param2 = obj.remove(20);
        obj.insert(20);
        int param3 = obj.getRandom();
        System.out.println(param3);

    }
}