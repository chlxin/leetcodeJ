package com.linxin.leetcodeJ.solution289;

/**
 * According to the Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
 *
 * Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
 *
 * Any live cell with fewer than two live neighbors dies, as if caused by under-population.
 * Any live cell with two or three live neighbors lives on to the next generation.
 * Any live cell with more than three live neighbors dies, as if by over-population..
 * Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * Write a function to compute the next state (after one update) of the board given its current state. The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously.
 *
 * Example:
 *
 * Input:
 * [
 *   [0,1,0],
 *   [0,0,1],
 *   [1,1,1],
 *   [0,0,0]
 * ]
 * Output:
 * [
 *   [0,0,0],
 *   [1,0,1],
 *   [0,1,1],
 *   [0,1,0]
 * ]
 * Follow up:
 *
 * Could you solve it in-place? Remember that the board needs to be updated at the same time: You cannot update some cells first and then use their updated values to update other cells.
 * In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches the border of the array. How would you address these problems?
 */
public class Solution {

    /**
     * 暴力解法
     * @param board
     */
    public void gameOfLife(int[][] board) {
        if (board == null || board.length < 1 || board[0].length < 1) {
            return;
        }

        int[] move = {0, -1, 1};

        int rows = board.length;
        int cols = board[0].length;

        int[][] copy = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                copy[i][j] = board[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int live = 0;
                for (int k = 0; k < 3; k++) {
                    for (int m = 0; m < 3; m++) {
                        if (move[k] == 0 && move[m] == 0) {
                            continue;
                        }
                        int r = i + move[k];
                        int c = j + move[m];

                        if ((r >= 0 && r < rows) && (c >=0 && c < cols) && copy[r][c] == 1) {
                            live++;
                        }
                    }
                }

                if (copy[i][j] == 1 && (live < 2 || live > 3)) {
                    board[i][j] = 0;
                }
                if (copy[i][j] == 0 && live == 3) {
                    board[i][j] = 1;
                }
            }
        }
    }

}
