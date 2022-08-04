package n0005.medium.longestPalindromicSubstring;

public class Solution {

    //todo - mmm... what about this case: "ac"!?
    public String longestPalindrome(String s) {

        if (s == null || s.length() == 0) {
            return "";
        }

        if (s.length() == 1) {
            return s;
        }

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (isPal(sub) && sub.length() > result.length()) {
                    result = sub;
                }
            }
        }

        return result;
    }

    public boolean isPal(String s) {

        char[] array = s.toCharArray();
        int j = array.length - 1;
        int i = 0;

        while (i <= j) {
            if (array[i] != array[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s01 = "babad";
        String s02 = "cbbd";
        System.out.println(solution.longestPalindrome(s01));
        System.out.println(solution.longestPalindrome(s02));
    }
}
