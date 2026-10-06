class Node {
    Node[] child = new Node[26];
    boolean islast = false;
}

class WordDictionary {
    Node trie;
    public WordDictionary() {
        trie = new Node();
    }

    public void addWord(String word) {
        Node node = trie;
        for (char ch : word.toCharArray()) {
            if (node.child[ch - 'a'] == null) {
                node.child[ch - 'a'] = new Node();
            }
            node = node.child[ch - 'a'];
        }
        node.islast = true;
    }

    public boolean search(String word) {
        return searchT(word, 0, trie);
    }

    public boolean searchT(String word, int ind, Node root) {
        Node curr = root;
        if (root == null)
            return false;
        if (ind == word.length())
            return root.islast;
        char ch = word.charAt(ind);
        if (ch == '.') {
            for (Node c : curr.child) {
                if (c != null && searchT(word, ind + 1, c)) {
                    return true;
                }
            }
            return false;
        }
        return searchT(word, ind + 1, curr.child[ch - 'a']);
    }
}