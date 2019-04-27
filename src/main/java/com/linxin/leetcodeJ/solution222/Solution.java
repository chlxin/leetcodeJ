package com.linxin.leetcodeJ.solution222;

public class Solution {

    public int countNodes(TreeNode root) {
        int h = heigh(root);
        return h < 0 ? 0 :
                heigh(root.right) == h - 1 ? (1 << h) + countNodes(root.right) : (1 << h - 1) + countNodes(root.left);
    }

    private int heigh(TreeNode node) {
        return node == null ? -1 : 1 + heigh(node.left);
    }

}
