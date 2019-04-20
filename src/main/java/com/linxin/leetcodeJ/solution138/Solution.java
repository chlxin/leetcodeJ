package com.linxin.leetcodeJ.solution138;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();

        Node cur = head;
        while (cur != null) {
            map.put(cur, new Node(cur.val, null, null));
            cur = cur.next;
        }

        cur = head;
        while (cur != null) {
            Node product = map.get(cur);
            if (cur.next != null) {
                product.next = map.get(cur.next);
            }
            if (cur.random != null) {
                product.random = map.get(cur.random);
            }
            cur = cur.next;
        }

        return map.get(head);
    }
}