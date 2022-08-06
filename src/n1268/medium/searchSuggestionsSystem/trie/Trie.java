package n1268.medium.searchSuggestionsSystem.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// custom class Trie with function to get 3 words starting with given prefix
class Trie {

    Node root;
    Node current;
    List<String> resultBuffer;

    // node definition of a trie
    public class Node {
        boolean isWord = false;
        List<Node> children = Arrays.asList(new Node[26]);
    }

    // runs a DFS on trie starting with given prefix
    // and adds all the words in the resultBuffer,
    // limiting result size to 3
    public void dfsWithPrefix(Node current, String word) {
        if (resultBuffer.size() == 3) {
            return;
        }
        if (current.isWord) {
            resultBuffer.add(word);
        }
        // run DFS on all possible paths
        for (char c = 'a'; c <= 'z'; c++)
            if (current.children.get(c - 'a') != null)
                dfsWithPrefix(current.children.get(c - 'a'), word + c);
    }

    public Trie() {
        root = new Node();
    }

    // inserts the string in trie
    public void insert(String s) {
        // points curr to the root of trie
        current = root;
        for (char c : s.toCharArray()) {
            if (current.children.get(c - 'a') == null)
                current.children.set(c - 'a', new Node());
            current = current.children.get(c - 'a');
        }
        // mark this node as a completed word
        current.isWord = true;
    }

    public List<String> getWordsStartingWith(String prefix) {
        current = root;
        resultBuffer = new ArrayList<String>();
        // move curr to the end of prefix in its trie representation
        for (char c : prefix.toCharArray()) {
            if (current.children.get(c - 'a') == null)
                return resultBuffer;
            current = current.children.get(c - 'a');
        }
        dfsWithPrefix(current, prefix);
        return resultBuffer;
    }
}
