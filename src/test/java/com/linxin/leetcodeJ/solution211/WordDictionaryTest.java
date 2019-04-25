package com.linxin.leetcodeJ.solution211;


import org.junit.Test;

import static org.junit.Assert.*;

public class WordDictionaryTest {

    @Test
    public void addWord() {
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("bad");
        dictionary.addWord("dad");
        dictionary.addWord("mad");
        System.out.println(dictionary.search("pad"));
        System.out.println(dictionary.search("bad"));
        System.out.println(dictionary.search(".ad"));
        System.out.println(dictionary.search("b.."));
    }

    @Test
    public void search() {
    }
}