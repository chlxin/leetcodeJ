package com.linxin.leetcodeJ.solution347;

import java.util.*;

/**
 * Given a non-empty array of integers, return the k most frequent elements.
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 * Note:
 *
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 *
 */
public class Solution {

    /**
     * 这个解法略显暴力
     *
     * 看discussion中不同的就是最后不用List而是用了优先队列。
     *
     * @param nums
     * @param k
     * @return
     */
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>(); // key: num, value: frequency
        for (int e : nums) {
            m.put(e, m.getOrDefault(e, 0) + 1);
        }
        TreeMap<Integer, LinkedList<Integer>> frequencies = new TreeMap<>();
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            LinkedList<Integer> candidates = frequencies.getOrDefault(entry.getValue(), new LinkedList<>());
            candidates.add(entry.getKey());
            frequencies.put(entry.getValue(), candidates);
        }
        List<Integer> res = new LinkedList<>();
        int left = k;
        while (left > 0) {
            Map.Entry<Integer, LinkedList<Integer>> entry = frequencies.lastEntry();
            LinkedList<Integer> value = entry.getValue();
            res.add(value.pop());
            if (value.isEmpty()) {
                frequencies.pollLastEntry();
            }
            left--;
        }
        return res;
    }

}
