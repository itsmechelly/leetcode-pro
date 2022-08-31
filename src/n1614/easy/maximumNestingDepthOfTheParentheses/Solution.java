package n1614.easy.maximumNestingDepthOfTheParentheses;

public class Solution {

    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '(') {
                depth++;
            } else if (s.charAt(i) == ')') {
                depth--;
            }
            maxDepth = Math.max(maxDepth, depth);
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(solution.maxDepth("(1)+((2))+(((3)))"));
    }
}
