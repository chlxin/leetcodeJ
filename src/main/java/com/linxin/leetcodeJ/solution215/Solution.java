package com.linxin.leetcodeJ.solution215;


/**
 * 215. Kth Largest Element in an Array
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * Example 1:
 * <p>
 * Input: [3,2,1,5,6,4] and k = 2
 * Output: 5
 * Example 2:
 * <p>
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4
 * Output: 4
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ array's length.
 */
class Solution {
    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k; // kth largest
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int j = quickPartition(nums, low, high);
            if (j < k) {
                low = j + 1;
            } else if (j > k) {
                high = j - 1;
            } else {
                break; // hit
            }
        }
        return nums[k];
    }

    private int quickPartition(int[] nums, int low, int high) {
        if (low > high) {
            throw new IllegalArgumentException();
        }
        if (low == high) {
            return low;
        }

        // chonse (low + high) / 2 as pivot
        int mid = (low + high) / 2;
        swap(nums, low, mid);
        int pivot = nums[low];

        int i = low + 1, j = high; // i左边都是比pivot小的数，j右边都是比pivot大或等于的数
        while (i <= j) {
            if (nums[i] < pivot) {
                i++;
            } else if (nums[j] >= pivot) {
                j--;
            } else {
                swap(nums, i, j);
                i++;
                j--;
            }
        }
        swap(nums, low, i - 1);
        return i - 1;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}