package com.linxin.leetcodeJ.solution384;

import java.util.Arrays;
import java.util.Random;

/**
 * Shuffle a set of numbers without duplicates.
 *
 * Example:
 *
 * // Init an array with set 1, 2, and 3.
 * int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 *
 * // Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
 * solution.shuffle();
 *
 * // Resets the array back to its original configuration [1,2,3].
 * solution.reset();
 *
 * // Returns the random shuffling of array [1,2,3].
 * solution.shuffle();
 */
public class Solution {

    private int[] origin;

    private int[] array;

    private Random random = new Random();

    public Solution(int[] nums) {
        origin = nums;
        array = Arrays.copyOfRange(nums, 0, nums.length);
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        array = origin;
        origin = Arrays.copyOfRange(origin, 0, origin.length);
        return origin;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, randRange(i, array.length));
        }
        return array;
    }

    private int randRange(int min, int max) {
        return min + random.nextInt(max - min);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
