package n0242.easy.validAnagram;

import java.util.HashMap;
import java.util.Map;

public class HashMapSolution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> hashMapS = new HashMap<>();
        Map<Character, Integer> hashMapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hashMapS.put(s.charAt(i), hashMapS.getOrDefault(s.charAt(i), 0) + 1);
            hashMapT.put(t.charAt(i), hashMapT.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (hashMapS.get(s.charAt(i)) != hashMapT.get(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HashMapSolution solution = new HashMapSolution();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("rat", "car"));
        System.out.println(solution);
    }
}
