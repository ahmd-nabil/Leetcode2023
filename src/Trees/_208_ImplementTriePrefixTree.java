package Trees;

/**
 * @author Ahmed Nabil
 */
public class _208_ImplementTriePrefixTree {
    class Trie {
        TrieNode root;
        public Trie() {
            root = new TrieNode();  // root TrieNode with all 26 null children
        }

        public void insert(String word) {
            TrieNode node = root;
            for(char c: word.toCharArray()) {
                if(node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TrieNode();
                }
                node = node.children[c - 'a'];
            }
            node.isEnd = true;
        }

        public boolean search(String word) {
            TrieNode node = root;
            for(char c: word.toCharArray()) {
                if(node.children[c - 'a'] == null) return false;
                node = node.children[c - 'a'];
            }
            return node.isEnd;
        }

        public boolean startsWith(String prefix) {
            TrieNode node = root;
            for(char c: prefix.toCharArray()) {
                if(node.children[c - 'a'] == null) return false;
                node = node.children[c - 'a'];
            }
            return true;
        }

        private static class TrieNode {
            TrieNode[] children;
            boolean isEnd;

            public TrieNode() {
                children = new TrieNode[26];
            }
        }
    }
}
