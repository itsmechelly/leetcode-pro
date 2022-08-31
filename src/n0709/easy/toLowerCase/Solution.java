package n0709.easy.toLowerCase;

public class Solution {

    public String toLowerCase(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (s.charAt(i) > 64 && s.charAt(i) < 91) {
                arr[i] = (char) (arr[i] + 32);
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.toLowerCase("Hello"));
        System.out.println(solution.toLowerCase("here"));
        System.out.println(solution.toLowerCase("LOVELY"));
    }
}
