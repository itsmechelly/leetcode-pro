package n0387.easy.firstUniqueCharacterInString;

import java.util.HashMap;

public class Solution {

    public int firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char currentKey = s.charAt(i);
            if (!map.containsKey(currentKey)) {
                map.put(currentKey, i);
            } else {
                map.put(currentKey, -1);
            }
        }

        int min = Integer.MAX_VALUE;

        for (char c : map.keySet()) {
            if (map.get(c) > -1 && map.get(c) < min) {
                min = map.get(c);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar("leetcode"));
        System.out.println(solution.firstUniqChar("loveleetcode"));
        System.out.println(solution.firstUniqChar("aabb"));
    }
}
