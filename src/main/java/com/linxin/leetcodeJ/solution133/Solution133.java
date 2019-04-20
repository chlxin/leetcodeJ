package com.linxin.leetcodeJ.solution133;

import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class Solution133 {

    public static void main(String[] args) {
        Node node1 = new Node(1, new LinkedList<>());
        Node node2 = new Node(2, new LinkedList<>());
        Node node3 = new Node(3, new LinkedList<>());
        Node node4 = new Node(4, new LinkedList<>());
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        Solution133 s = new Solution133();
        var res = s.cloneGraph(node1);
        System.out.println(res);
    }

    // 广度优先搜索, 可能顺序会不一致
    public Node cloneGraph2(Node node) {
        if (node == null) {
            return null;
        }
        Map<Node, Node> map = new HashMap<>();
        Set<Node> visited = new HashSet<>();

        Queue<Node> q = new LinkedList<>();
        q.offer(node);

        while (!q.isEmpty()) {
            Node cur = q.poll();
            if (!map.containsKey(cur)) {
                map.put(cur, new Node(cur.val, new LinkedList<>()));
            }
            visited.add(cur);
            Node curNew = map.get(cur);
            for (Node neighbor: cur.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val, new LinkedList<>()));
                }
                if (!visited.contains(neighbor)) {
                    q.offer(neighbor);
                    Node neighborNew = map.get(neighbor);
                    neighborNew.neighbors.add(curNew);
                    curNew.neighbors.add(neighborNew);
                }
            }
        }
        return map.get(node);
    }

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Map<Node, Node> map = new HashMap<>();

        Queue<Node> q = new LinkedList<>();
        q.offer(node);

        while (!q.isEmpty()) {
            Node cur = q.poll();
            if (!map.containsKey(cur)) {
                map.put(cur, new Node(cur.val, new LinkedList<>()));
            }
            for (Node neighbor: cur.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val, new LinkedList<>()));
                    q.offer(neighbor);
                }

            }
        }

        for (Map.Entry<Node, Node> entry : map.entrySet()) {
            Node origin = entry.getKey();
            Node product = entry.getValue();
            for (Node nb : origin.neighbors) {
                product.neighbors.add(map.get(nb));
            }
        }
        return map.get(node);
    }

}
