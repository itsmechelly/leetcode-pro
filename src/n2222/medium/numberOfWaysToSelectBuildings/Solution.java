package n2222.medium.numberOfWaysToSelectBuildings;

import java.util.Arrays;
import java.util.Stack;

public class Solution {

    public long numberOfWays(String s) {
        long result = 0;
        char[] charArray = s.toCharArray();

        int[] digitCounter = new int[2];
        for (char c : charArray) {
            digitCounter[c - '0']++;
        }

        int[] checkDigit = new int[2];
        for (char c : charArray) {
            int digit = c - '0';
            int resize = 1 - digit;

            System.out.println("result -> " + result);
            System.out.println("checkDigit[resize] -> " + checkDigit[resize]);
            System.out.println("digitCounter[resize] -> " + digitCounter[resize]);
            System.out.println(" checkDigit[digit] -> " +  checkDigit[digit]);
            result += (long) checkDigit[resize] * (digitCounter[resize] - checkDigit[resize]);
            checkDigit[digit]++;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberOfWays("10010"));
        System.out.println(solution.numberOfWays("001101"));
        System.out.println(solution.numberOfWays("11100"));
    }
}
