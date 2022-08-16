package n1221.easy.splitStringInBalancedStrings;

public class Solution {

    public int balancedStringSplit(String s) {
        int position = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                position++;
            } else {
                position--;
            }
            if (position == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.balancedStringSplit("RLRRLLRLRL"));
        System.out.println(solution.balancedStringSplit("RLRRRLLRLL"));
        System.out.println(solution.balancedStringSplit("LLLLRRRR"));
    }
}
