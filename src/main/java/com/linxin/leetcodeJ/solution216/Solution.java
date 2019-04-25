package com.linxin.leetcodeJ.solution216;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, k, n, 0);
        return result;
    }


    private void backtrack(List<List<Integer>> result, List<Integer> list, int[] nums, int k, int target, int start) {
        if (k == 0 && target == 0) {
            result.add(new ArrayList<>(list));
        } else {
            for (int i = start; i < nums.length && target > 0 && k > 0; i++) {
                list.add(nums[i]);
                backtrack(result, list, nums, k - 1, target - nums[i], i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

}
