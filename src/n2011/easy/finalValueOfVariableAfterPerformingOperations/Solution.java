package n2011.easy.finalValueOfVariableAfterPerformingOperations;

import java.util.Objects;

public class Solution {

    public int finalValueAfterOperations(String[] operations) {
        int res = 0;

        if (operations == null) {
            return res;
        }

        for (String operation : operations) {
            if (Objects.equals(operation, "++X") || Objects.equals(operation, "X++")) {
                res++;
            } else res--;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] operations01 = {"--X", "X++", "X++"};
        String[] operations02 = {"++X", "++X", "X++"};
        String[] operations03 = {"X++", "++X", "--X", "X--"};
        System.out.println(solution.finalValueAfterOperations(operations01));
        System.out.println(solution.finalValueAfterOperations(operations02));
        System.out.println(solution.finalValueAfterOperations(operations03));
    }
}
