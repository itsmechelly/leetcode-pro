package n0242.easy.validAnagram;

import java.util.*;

public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();

        Arrays.sort(charsS);
        Arrays.sort(charsT);

        return Arrays.equals(charsS, charsT);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("aacc", "ccac"));
        System.out.println(solution);
    }
}
