package com.linxin.leetcodeJ.solution151;

import java.util.ArrayList;

public class Solution {

    public String reverseWords(String s) {
        char[] cs =  s.toCharArray();
        ArrayList<String> words = new ArrayList<>();

        int n = cs.length;
        int index = 0;
        while (index < n && cs[index] == ' ') {
            index++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = index; i <= n; ) {
            if (i == n || cs[i] == ' ') {
                words.add(sb.toString());
                sb = new StringBuilder();
                while (i < n && cs[i] == ' ') {
                    i++;
                }
                if (i == n) {
                    i++;
                }
            } else {
                sb.append(cs[i]);
                i++;
            }
        }

        int wl = words.size();
        for (int i = 0; i < wl/2; i++) {
            String a = words.get(i);
            String b = words.get(wl - 1 - i);
            words.set(i, b);
            words.set(wl - 1 - i, a);
        }


        return String.join(" ", words);
    }

}
