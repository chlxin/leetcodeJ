package com.linxin.leetcodeJ.solution199;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void rightSideView() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        root.left = node2;
        root.right = node3;
        node2.right = node5;
        node3.right = node4;

        List<Integer> res = s.rightSideView(root);
        System.out.println(res);
    }
}