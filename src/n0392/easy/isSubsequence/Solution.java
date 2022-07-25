package n0392.easy.isSubsequence;

public class Solution {

    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ahbgdc";
        Solution solution = new Solution();
        boolean res = solution.isSubsequence(str1, str2);

        if (res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
