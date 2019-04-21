package com.linxin.leetcodeJ.solution165;

public class Solution {

    public int compareVersion(String version1, String version2) {
        String[] level1 = version1.split("\\.");
        String[] level2 = version2.split("\\.");

        int length = Math.max(level1.length, level2.length);
        for (int i = 0; i < length; i++) {
            int v1 = i < level1.length ? Integer.parseInt(level1[i]) : 0;
            int v2 = i < level2.length ? Integer.parseInt(level2[i]) : 0;

            if (v1 > v2) {
                return 1;
            } else if (v1 < v2) {
                return -1;
            }

        }
        return 0;
    }
}
