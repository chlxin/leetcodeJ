package com.linxin.leetcodeJ.solution149;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[][] points = {
                {3, 10},
                {0, 2},
                {0, 2},
                {3, 10}
        };
        Solution s = new Solution();
        int res = s.maxPoints(points);
        System.out.println(res);
    }

    // case1: same point; case2: same x; case 3: k
    public int maxPoints(int[][] points) {
        int res = 0;
        int n = points.length;
        BigDecimal maxInt = new BigDecimal(Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            int samePoint = 1;
            Map<BigDecimal, Integer> map = new HashMap<>();
            for (int j = i + 1; j < n; j++) {
                if (points[i][0] == points[j][0] && points[i][1] == points[j][1]) {
                    samePoint++;
                } else if (points[i][0] == points[j][0]) {
                    int c = map.getOrDefault(maxInt, 0);
                    map.put(maxInt, c + 1);
                } else {
                    BigDecimal delY = new BigDecimal(points[j][1] - points[i][1]);
                    BigDecimal delX = new BigDecimal(points[j][0] - points[i][0]);
                    BigDecimal slope = delY.divide(delX, MathContext.DECIMAL128);
                    int c = map.getOrDefault(slope, 0);
                    map.put(slope, c + 1);
                }
            }
            int localMax = 0;
            for (Map.Entry<BigDecimal, Integer> e : map.entrySet()) {
                localMax = Math.max(e.getValue(), localMax);
            }
            localMax += samePoint;
            if (res < localMax) {
                res = localMax;
            }
        }
        return res;
    }

}
