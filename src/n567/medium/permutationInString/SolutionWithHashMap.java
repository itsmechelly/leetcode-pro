package n567.medium.permutationInString;

import java.util.Arrays;

class Solution {

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        s1 = sort(s1);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            if (s1.equals(sort(s2.substring(i, i + s1.length())))) {
                return true;
            }
        }
        return false;
    }

    public static String sort(String string) {
        char[] sortedArray = string.toCharArray();
        Arrays.sort(sortedArray);
        return new String(sortedArray);
    }

    public static void main(String[] args) {
        System.out.println(Solution.checkInclusion("ab", "eidbaooo"));
        System.out.println(Solution.checkInclusion("ab", "eidboaoo"));
    }
}
