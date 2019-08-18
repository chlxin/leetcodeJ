package com.linxin.leetcodeJ.solution307;

public class NumArray {

    private int[] array;

    private int[] BITree; // binary index tree

    public NumArray(int[] nums) {
        array = nums;
        BITree = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            add(i, nums[i]);
        }
    }

    public void update(int i, int val) {
        int difference = val - array[i];
        if (difference == 0) {
            return;
        }
        array[i] = val;
        add(i, difference);

    }

    public int sumRange(int i, int j) {
        return prefixSum(j) - prefixSum(i - 1);
    }

    /**
     * add val in index = i
     *
     * @param i
     * @param val
     */
    private void add(int i, int val) {
        int n = array.length;
        int index = i + 1;
        while (index <= n) {
            BITree[index] += val;
            index += index & (-index);
        }
    }

    private int prefixSum(int index) {
        if (index < 0) {
            return 0;
        }
        int sum = 0;
        index += 1;
        while (index > 0) {
            sum += BITree[index];
            index -= index & (-index);
        }
        return sum;
    }


}
