package n2325.easy.decodeTheMessage;

import java.util.*;

public class Solution {

    public String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();
        key = key.replaceAll(" ", "");
        HashMap<Character, Character> letters = new HashMap<>();

        char original = 'a';
        for (int i = 0; i < key.length(); i++) {
            if (!letters.containsKey(key.charAt(i))) {
                letters.put(key.charAt(i), original++);
            }
        }

        for (int i = 0; i < message.length(); i++) {
            if (letters.containsKey(message.charAt(i))) {
                sb.append(letters.get(message.charAt(i)));
            } else {
                sb.append(message.charAt(i));
            }
        }
        System.out.println(letters);
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String key01 = "the quick brown fox jumps over the lazy dog";
        String message01 = "vkbs bs t suepuv";
        String key02 = "eljuxhpwnyrdgtqkviszcfmabo";
        String message02 = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";

        System.out.println(solution.decodeMessage(key01, message01));
        System.out.println(solution.decodeMessage(key02, message02));
    }
}
