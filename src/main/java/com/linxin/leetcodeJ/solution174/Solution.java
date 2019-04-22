package com.linxin.leetcodeJ.solution174;

public class Solution {

    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        if (m == 0) {
            return 0;
        }
        int n = dungeon[0].length;
        if (n == 0) {
            return 0;
        }

        int[][] dp = new int[m][n];
        // handle base case dp(m-1, n-1)
        if (dungeon[m - 1][n - 1] < 0) {
            dp[m - 1][n - 1] = 1 - dungeon[m - 1][n - 1];
        } else {
            dp[m - 1][n - 1] = 1;
        }
        // m-1 row
        for (int j = n - 2; j >= 0; j--) {
            if (dungeon[m - 1][j] < 0) {
                dp[m - 1][j] = dp[m - 1][j + 1] - dungeon[m - 1][j];
            } else {
                if (dungeon[m - 1][j] >= dp[m - 1][j + 1]) {
                    dp[m - 1][j] = 1;
                } else {
                    dp[m - 1][j] = dp[m - 1][j + 1] - dungeon[m - 1][j];
                }
            }
        }

        // n-1 row
        for (int i = m - 2; i >= 0; i--) {
            if (dungeon[i][n - 1] < 0) {
                dp[i][n - 1] = dp[i + 1][n - 1] - dungeon[i][n - 1];
            } else {
                if (dungeon[i][n - 1] >= dp[i + 1][n - 1]) {
                    dp[i][n - 1] = 1;
                } else {
                    dp[i][n - 1] = dp[i + 1][n - 1] - dungeon[i][n - 1];
                }
            }
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                if (dungeon[i][j] < 0) {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) - dungeon[i][j];
                } else {
                    int min = Math.min(dp[i + 1][j], dp[i][j + 1]);
                    if (dungeon[i][j] >= min) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = min - dungeon[i][j];
                    }
                }
            }
        }

        return dp[0][0];
    }

}
