package com.linxin.leetcodeJ.solution187;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findRepeatedDnaSequences() {
        Solution solution = new Solution();
        List<String> res = solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        System.out.println(res);
    }
}