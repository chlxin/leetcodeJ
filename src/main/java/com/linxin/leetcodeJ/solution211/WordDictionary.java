package com.linxin.leetcodeJ.solution211;

public class WordDictionary {

    private TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public WordDictionary() {
        root = new TrieNode();
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TrieNode(c);
            }
            node = node.children[c - 'a'];
        }
        node.isWord = true;
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        return doSearch(word, root);
    }

    private boolean doSearch(String word, TrieNode node) {
        for (int i = 0; i < word.length() && node != null; i++) {
            if (word.charAt(i) != '.') {
                node = node.children[word.charAt(i) - 'a'];
            } else {
                TrieNode tmp = node;
                for (int j = 0; j < 26; j++) {
                    node = tmp.children[j];
                    if (doSearch(word.substring(i + 1), node)) {
                        return true;
                    }
                }
            }
        }
        return node != null && node.isWord;
    }

}
