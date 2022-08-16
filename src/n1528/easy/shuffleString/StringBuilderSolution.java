package n1528.easy.shuffleString;

public class StringBuilderSolution {

    public String restoreString(String s, int[] indices) {
        StringBuilder stringBuilder = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            stringBuilder.setCharAt(indices[i], s.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        StringBuilderSolution solution = new StringBuilderSolution();

        String s01 = "codeleet";
        int[] indices01 = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(solution.restoreString(s01, indices01));

        String s02 = "abc";
        int[] indices02 = {0, 1, 2};
        System.out.println(solution.restoreString(s02, indices02));
    }
}
