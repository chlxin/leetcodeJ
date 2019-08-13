package com.linxin.leetcodeJ.solution324;

public class Solution {

    public void wiggleSort(int[] nums) {
        int median = findKthLargest(nums, (nums.length + 1) / 2);
        int n = nums.length;
        int left = 0, i = 0, right = n - 1;
        while (i <= right) {
            if (nums[A(i, n)] > median) {
                swap(nums, A(left++, n), A(i++, n));
            } else if (nums[A(i, n)] < median) {
                swap(nums, A(right--, n), A(i, n));
            } else {
                i++;
            }
        }
    }

    private int A(int index, int n) {
        return (1 + 2*index) % (n | 1);
    }

    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k; // kth largest
        int low = 0;
        int high = nums.length - 1;

        while(low < high) {
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

    private void swap(int[]nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
