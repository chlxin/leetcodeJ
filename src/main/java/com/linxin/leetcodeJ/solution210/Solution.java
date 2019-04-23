package com.linxin.leetcodeJ.solution210;

import java.util.*;

public class Solution {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        int next = 0;
        // 每一个节点的入度
        int[] inDegrees = new int[numCourses];

        Map<Integer, LinkedList<Integer>> map = new HashMap<>();
        // init
        for (int[] pair : prerequisites) {
            inDegrees[pair[0]]++;
            LinkedList<Integer> list = map.getOrDefault(pair[1], new LinkedList<>());
            list.add(pair[0]);
            map.put(pair[1], list);
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < inDegrees.length; i++) {
            int inDegree = inDegrees[i];
            if (inDegree == 0) {
                q.offer(i);
                res[next++] = i;
            }
        }

        while (!q.isEmpty()) {
            int cur = q.poll();
            List<Integer> list = map.getOrDefault(cur, new LinkedList<>());
            for (int val : list) {
                inDegrees[val]--;
                if (inDegrees[val] == 0) {
                    q.offer(val);
                    res[next++] = val;
                }
            }
        }

        if (next < numCourses) {
            int[] t = {};
            return t;
        }
        return res;
    }

}
