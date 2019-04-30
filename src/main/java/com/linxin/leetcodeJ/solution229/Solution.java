package com.linxin.leetcodeJ.solution229;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int count1 = 0, count2 = 0, candicate1 = 0, candicate2 = 0;
        for (int num : nums) {
            if (num == candicate1) {
                count1++;
            } else if (num == candicate2) {
                count2++;
            } else if (count1 == 0) {
                candicate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candicate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (candicate1 == num) {
                count1++;
            }
            if (candicate2 == num) {
                count2++;
            }
        }
        if (count1 > nums.length / 3) {
            res.add(candicate1);
        }
        if (count2 > nums.length / 3 && candicate2 != candicate1) {
            res.add(candicate2);
        }
        return res;
    }

}
