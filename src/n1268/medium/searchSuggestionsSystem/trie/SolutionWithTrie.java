package n1268.medium.searchSuggestionsSystem.trie;

import java.util.ArrayList;
import java.util.List;

class SolutionWithTrie {

    List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Trie trie = new Trie();
        List<List<String>> result = new ArrayList<>();

        // add all words to trie
        for (String w : products) {
            trie.insert(w);
        }
        String prefix = new String();
        for (char c : searchWord.toCharArray()) {
            prefix += c;
            result.add(trie.getWordsStartingWith(prefix));
        }
        return result;
    }

    public static void main(String[] args) {
        SolutionWithTrie solution = new SolutionWithTrie();

        String[] products01 = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String[] products02 = {"havana"};
        String[] products03 = {"bags", "baggage", "banner", "box", "cloths"};

        String searchWord01 = "mouse";
        String searchWord02 = "havana";
        String searchWord03 = "bags";

        System.out.println(solution.suggestedProducts(products01, searchWord01));
        System.out.println(solution.suggestedProducts(products02, searchWord02));
        System.out.println(solution.suggestedProducts(products03, searchWord03));
    }
}
