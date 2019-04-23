package com.linxin.leetcodeJ.solution208;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrieTest {

    @Test
    public void all() {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));;   // returns true
        System.out.println(trie.search("app"));     // returns false
        System.out.println(trie.startsWith("app")); // returns true
        trie.insert("app");
        System.out.println(trie.search("app"));     // returns true
    }
}