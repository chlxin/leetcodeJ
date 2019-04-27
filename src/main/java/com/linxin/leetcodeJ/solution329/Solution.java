package com.linxin.leetcodeJ.solution329;

public class Solution {

    private int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, 1},
            {0, -1}
    };

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int m = matrix.length - 1, n = matrix[0].length - 1;
        int res = 1;
        int[][] cache = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                res = Math.max(dfs(matrix, i, j, m, n, cache), res);
            }
        }
        return res;
    }

    /**
     * 本质是一个搜索的问题，本题不需要记录visited数组的原因是因为该题搜索具有方向性
     * 如果把matrix立体化，搜索的方向只能往坡顶方向搜，因此不会回退搜索
     *
     * @param matrix 矩阵
     * @param i      当前搜索的横坐标
     * @param j      当前搜索的纵坐标
     * @param m      矩阵的行数-1
     * @param n      矩阵的列数-1
     * @param cache  备忘录，记录已经遍历过的i,j的最长子序列的最长长度
     * @return
     */
    private int dfs(int[][] matrix, int i, int j, int m, int n, int[][] cache) {
        if (cache[i][j] != 0) {
            return cache[i][j];
        }

        int max = 1; // 默认是1，因为即便四周都比当前值要小，也可以认为序列长度为1
        // 四个方向搜索
        for (int[] dir : directions) {
            int x = i + dir[0];
            int y = j + dir[1];
            if (x >= 0 && x <= m && y >= 0 && y <= n && matrix[i][j] < matrix[x][y]) {
                int res = 1 + dfs(matrix, x, y, m, n, cache);
                if (res > max) {
                    max = res;
                }
            }
        }
        cache[i][j] = max;
        return max;
    }

}
