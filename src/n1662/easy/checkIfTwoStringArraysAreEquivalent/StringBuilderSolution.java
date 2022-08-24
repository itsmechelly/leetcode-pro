package n1662.easy.checkIfTwoStringArraysAreEquivalent;

public class StringBuilderSolution {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            str1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            str2.append(word2[i]);
        }

        return str1.toString().equals(str2.toString());
    }

    public static void main(String[] args) {
        StringBuilderSolution solution = new StringBuilderSolution();
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
