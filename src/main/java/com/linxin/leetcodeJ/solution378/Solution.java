package com.linxin.leetcodeJ.solution378;

/**
 * Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.
 * <p>
 * Note that it is the kth smallest element in the sorted order, not the kth distinct element.
 * <p>
 * Example:
 * <p>
 * matrix = [
 * [ 1,  5,  9],
 * [10, 11, 13],
 * [12, 13, 15]
 * ],
 * k = 8,
 * <p>
 * return 13.
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ n2.
 */
public class Solution {

    /**
     * 整体的思路仍然是二分查找，二分查找的思路主要有两种，使用index(最常用), range。
     * 这里使用range的思路，设置了整个matrix的下限和上限，根据这两个值的中位数来做查找。
     * 每次查找找出比mid小的数，与k值比较，若小于k，那么在[mid+1,high)中存在k小的数
     * 否则就在[low,mid)
     *
     * @param matrix
     * @param k
     * @return
     */
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = matrix[0][0], high = matrix[m - 1][n - 1] + 1;
        while (low < high) {
            int mid = low + (high - low) / 2; // 不可以用 (low + high) / 2, 当负数的时候有问题
            int count = 0, j = n - 1;
            for (int i = 0; i < m; i++) {
                while (j >= 0 && matrix[i][j] > mid) {
                    j--;
                }
                count += j + 1;
            }
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }


}
