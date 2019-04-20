package com.linxin.leetcodeJ.sulution117;

import com.google.gson.GsonBuilder;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }


}

public class Solution117 {

    public static void main(String[] args) {
        Node node = new Node(1,
                new Node(2, new Node(4, new Node(7), null), new Node(5)),
                new Node(3, null, new Node(6, null, new Node(8))));
        Solution117 s = new Solution117();
        Node res = s.connect(node);
        String json = new GsonBuilder().serializeNulls().create().toJson(res);
        System.out.println(json);

    }

    public Node connect(Node root) {
        Node level = root;
        Node dummy = new Node(0, null, null, null);
        Node pre = dummy;
        while (level != null) {
            if (level.left != null) {
                pre.next = level.left;
                pre = pre.next;
            }

            if (level.right != null) {
                pre.next = level.right;
                pre = pre.next;
            }

            level = level.next;
            // level == null means should jump next level
            if (level == null) {
                level = dummy.next;
                pre = dummy;
                dummy.next = null; // 假如这行注释掉的话会导致循环退不出去，原因在于在于最后一步
            }
        }

        return root;
    }

}
