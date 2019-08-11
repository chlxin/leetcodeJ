package com.linxin.leetcodeJ.solution404;

public class Solution {

    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root);
    }

    private int dfs(TreeNode cur) {
        if (cur == null) {
            return 0;
        }
        int res = 0;
        if (cur.left != null && isLeaf(cur.left)) {
            res += cur.left.val;
        }
        res += dfs(cur.left);
        res += dfs(cur.right);
        return res;
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

}
