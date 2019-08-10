package com.linxin.leetcodeJ.solution257;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new LinkedList<>();
        if (root != null) {
            dfs(root, "", ans);
        }
        return ans;
    }

    private void dfs(TreeNode cur, String curPath, List<String> res) {
        // will not appear
        if (cur == null) {
            return;
        }
        if (cur.left == null && cur.right == null) {
            // prepare result
            res.add(curPath + cur.val);
        }
        if (cur.left != null) {
            dfs(cur.left, curPath + cur.val + "->", res);
        }
        if (cur.right != null) {
            dfs(cur.right, curPath + cur.val + "->", res);
        }
    }

}
