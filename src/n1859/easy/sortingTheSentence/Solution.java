package n1859.easy.sortingTheSentence;

public class Solution {

    public String sortSentence(String s) {
        String[] array = s.split(" ");
        String[] res = new String[array.length];
        StringBuilder stringBuilder = new StringBuilder();

        int i = 0;
        for (String string : array) {
            i = (string.charAt(string.length() - 1) - '0');
            res[i - 1] = string.substring(0, string.length() - 1);
        }

        for (i = 0; i < res.length - 1; i++) {
            stringBuilder.append(res[i]).append(" ");
        }
        stringBuilder.append(res[i]);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sortSentence("is2 sentence4 This1 a3"));
        System.out.println(solution.sortSentence("Myself2 Me1 I4 and3"));
    }
}
