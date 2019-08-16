package com.linxin.leetcodeJ.solution315;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].
 *
 * Example:
 *
 * Input: [5,2,6,1]
 * Output: [2,1,1,0]
 * Explanation:
 * To the right of 5 there are 2 smaller elements (2 and 1).
 * To the right of 2 there is only 1 smaller element (1).
 * To the right of 6 there is 1 smaller element (1).
 * To the right of 1 there is 0 smaller element.
 *
 */
public class Solution {

    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            res.add(count);
        }
        return res;
    }

    private int[] count;

    public List<Integer> countSmaller_2(int[] nums) {
        List<Integer> res = new ArrayList<>();

        count = new int[nums.length];
        int[] indexes = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            indexes[i] = i;
        }
        mergeSort(nums, indexes, 0, nums.length - 1);
        for(int i = 0; i < count.length; i++){
            res.add(count[i]);
        }
        return res;
    }

    private void mergeSort(int[] nums, int[] indexes, int start, int end) {
        if (end <= start) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(nums, indexes, start, mid);
        mergeSort(nums, indexes, mid + 1, end);

        merge(nums, indexes, start, end);
    }

    private void merge(int[] nums, int[] indexes, int start, int end) {
        if (end <= start) {
            return;
        }
        int mid = (start + end) / 2;
        int leftIndex = start, rightIndex = mid + 1;
        int[] indexes2 = new int[end - start + 1];
        int i = 0;
        int rightCount = 0;

        while (leftIndex <= mid && rightIndex <= end) {
            if (nums[indexes[leftIndex]] > nums[indexes[rightIndex]]) {
                indexes2[i] = indexes[rightIndex];
                rightIndex++;
                rightCount++;
            } else {
                indexes2[i] = indexes[leftIndex];
                count[indexes[leftIndex]] += rightCount;
                leftIndex++;
            }
            i++;
        }
        while (leftIndex <= mid) {
            indexes2[i] = indexes[leftIndex];
            count[indexes[leftIndex]] += rightCount;
            leftIndex++;
            i++;
        }
        while (rightIndex <= end) {
            indexes2[i] = indexes[rightIndex];
            rightIndex++;
            i++;
        }
        for (int k = start; k <= end; k++) {
            indexes[k] = indexes2[k - start];
        }
    }

}
