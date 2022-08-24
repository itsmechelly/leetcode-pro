package n1662.easy.checkIfTwoStringArraysAreEquivalent;

public class Solution {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";

        for (String s : word1) {
            str1 += s;
        }
        for (String s : word2) {
            str2 += s;
        }

        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] word01 = {"ab", "c"};
        String[] word02 = {"a", "bc"};
        String[] word03 = {"a", "cb"};
        String[] word04 = {"ab", "c"};
        String[] word05 = {"abc", "d", "defg"};
        String[] word06 = {"abcddefg"};
        System.out.println(solution.arrayStringsAreEqual(word01, word02));
        System.out.println(solution.arrayStringsAreEqual(word03, word04));
        System.out.println(solution.arrayStringsAreEqual(word05, word06));
    }
}
