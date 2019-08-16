package com.linxin.leetcodeJ.solution304;

public class NumMatrix {

    private int[][] sumTable;

    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        sumTable = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sumTable[i + 1][j + 1] = sumTable[i][j + 1] + sumTable[i + 1][j] + matrix[i][j] - sumTable[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sumTable[row2 + 1][col2 + 1] - sumTable[row2 + 1][col1] - sumTable[row1][col2 + 1] + sumTable[row1][col1];
    }

}
