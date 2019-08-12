package com.linxin.leetcodeJ.solution380;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomizedSet {

    private Map<Integer, Integer> map;

    private ArrayList<Integer> arrays;

    private Random random;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        arrays = new ArrayList<>();
        random = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        arrays.add(val);
        int index = arrays.size() - 1;
        map.put(val, index);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        if (index < arrays.size() - 1) {
            Integer lastItem = arrays.get(arrays.size() - 1);
            arrays.set(index, lastItem);
            map.put(lastItem, index);
        }
        map.remove(val);
        arrays.remove(arrays.size() - 1);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {

        int next = random.nextInt(arrays.size());
        return arrays.get(next);
    }

}
