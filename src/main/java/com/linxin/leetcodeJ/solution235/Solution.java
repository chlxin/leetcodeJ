package com.linxin.leetcodeJ.solution235;

public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val == p.val) {
            return p;
        } else if (root.val == q.val) {
            return q;
        }

        TreeNode res;
        if (root.val > p.val ^ root.val > q.val) {
            res = root;
        } else {
            if (root.val > p.val) {
                res = lowestCommonAncestor(root.left, p, q);
            } else {
                res = lowestCommonAncestor(root.right, p, q);
            }
        }
        return res;
    }

}
