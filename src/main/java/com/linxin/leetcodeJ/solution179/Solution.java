package com.linxin.leetcodeJ.solution179;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public String largestNumber(int[] nums) {
        String[] cs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            cs[i] = String.valueOf(nums[i]);
        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String str1 = o1 + o2;
                String str2 = o2 + o1;
                return str2.compareTo(str1);
            }
        };

        Arrays.sort(cs, comparator);
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i + 1 < cs.length) {
            if ("0".equals(cs[i]) && "0".equals(cs[i + 1])) {
                i++;
            } else {
                break;
            }
        }
        while (i < cs.length) {
            sb.append(cs[i]);
            i++;
        }

        return sb.toString();
    }

}
