package com.linxin.leetcodeJ.solution350;

import java.util.*;

/**
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Note:
 *
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 *
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 *
 */
public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();
        for (int n : nums1) {
            m1.put(n, m1.getOrDefault(n, 0) + 1);
        }
        for (int n : nums2) {
            m2.put(n, m2.getOrDefault(n, 0) + 1);
        }
        int[] res = new int[nums1.length + nums2.length];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : m1.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (m2.containsKey(key)) {
                int times = Math.min(value, m2.get(key));
                for (int i = 0; i < times; i++) {
                    res[index++] = key;
                }
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }

}
