package n0819.easymostCommonWord;

import java.util.*;

class Solution {

    public String mostCommonWord(String paragraph, String[] banned) {

        // replace the punctuations with spaces,
        // and put all letters in lower case
        String normalizedStr = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();

        // split the string into words
        String[] words = normalizedStr.split("\\s+");

        Set<String> bannedWords = new HashSet();
        for (String word : banned) {
            bannedWords.add(word);
        }

        Map<String, Integer> wordCount = new HashMap();
        // count the appearance of each word, excluding the banned words
        for (String word : words) {
            if (!bannedWords.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // return the word with the highest frequency
        return Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String paragraph01 = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned01 = {"hit"};
        String paragraph02 = "a.";
        String[] banned02 = {""};
        System.out.println(solution.mostCommonWord(paragraph01, banned01));
        System.out.println(solution.mostCommonWord(paragraph02, banned02));
    }
}
