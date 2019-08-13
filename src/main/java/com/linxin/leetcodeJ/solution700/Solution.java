package com.linxin.leetcodeJ.solution700;

public class Solution {

    public TreeNode searchBST(TreeNode root, int val) {
        return search(root, val);
    }

    private TreeNode search(TreeNode node, int val) {
        if (node == null) {
            return null;
        }

        if (node.val == val) {
            return node;
        } else if (node.val < val && node.right != null) {
            return search(node.right, val);
        } else if (node.val > val && node.left != null) {
            return search(node.left, val);
        }
        return null;

    }

}
