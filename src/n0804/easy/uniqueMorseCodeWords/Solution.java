package n0804.easy.uniqueMorseCodeWords;

import java.util.*;

public class Solution {

    public int uniqueMorseRepresentations(String[] words) {
        String[] letters = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> hashSet = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char wc : word.toCharArray()) {
                sb.append(letters[wc - 'a']);
            }
            hashSet.add(sb.toString());
        }

        return hashSet.size();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words01 = {"gin", "zen", "gig", "msg"};
        String[] words02 = {"a"};
        System.out.println(solution.uniqueMorseRepresentations(words01));
        System.out.println(solution.uniqueMorseRepresentations(words02));
    }
}
